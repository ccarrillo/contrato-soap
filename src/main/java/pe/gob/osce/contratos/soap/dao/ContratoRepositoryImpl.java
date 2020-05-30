package pe.gob.osce.contratos.soap.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.osce.contratos.soap.api.gen.CustomerRequest;
import pe.gob.osce.contratos.soap.dto.ContratoDto;
import pe.gob.osce.contratos.soap.dto.ProyectoInversionDto;
import pe.gob.osce.contratos.soap.utils.FechaUtil;
import pe.gob.osce.contratos.soap.utils.TipoIndConsorciaType;

@Repository
public class ContratoRepositoryImpl implements ContratoRepository {

	@Autowired
	@Qualifier("entityManagerFactoryA")
	private EntityManager em1;
	
	@Autowired
	@Qualifier("entityManagerFactoryB")
	private EntityManager em2;
    
	@Override
	@Transactional(readOnly = true)
	public List<ContratoDto> cargarContratos(CustomerRequest customerRequest) {
		StringBuilder jpql = new StringBuilder();
		List<ContratoDto> contratos = new ArrayList<>();
		boolean reqRucCodContra = false;
		boolean reqFecEntContra = false;
		boolean reqFecSuscContr = false;

		reqRucCodContra = customerRequest.getRucCodigoContratista() != null && !customerRequest.getRucCodigoContratista().trim().isEmpty();
		reqFecEntContra = customerRequest.getRucEntidadContratante() != null && !customerRequest.getRucEntidadContratante().trim().isEmpty();
		reqFecSuscContr = customerRequest.getFechaSuscripcionContrato() != null && !customerRequest.getFechaSuscripcionContrato().isEmpty();
		jpql.append("SELECT ");
		jpql.append("CAST (PROPUESTA.RUC_POSTOR AS VARCHAR2(11)) C_RUCONTRA, ");// (01) RUC / Código del Contratista
		jpql.append("PROPUESTA.NOM_POSTOR C_CONTRATISTA, ");// -- (02) Nombre o Razón Social del Contratista
		jpql.append("CONTRATO.IND_CONSORCIO, ");// -- (03) Indicador de Consorcio
		jpql.append("CAST (ENTIDADUE_ANHO.EUE_RUC AS VARCHAR2(11)) C_RUCENTCON, ");// -- (04) Ruc Entidad contratante
		jpql.append("ENTIDADUE_ANHO.EUE_DESC C_DESENTCON, ");// -- (05) Nombre de la Entidad contratante
		jpql.append("(TIPO_PROCESO.proc_tipo_sigla||'-'||CONVOCATORIA.proc_num||'-' ");
		jpql.append("||CONVOCATORIA.anhoentidad||'-'||CONVOCATORIA.proc_sigla)  AS NOMENCLATURA, ");// -- (06) Nomenclatura del proceso
		jpql.append("OBJETO.DESCRIPCION OBJETO, ");// -- (07) Objeto de la Contratación
		jpql.append("CONTRATO.N_CONTRATO C_NUMCONTRA, ");// -- (08) Número del contrato
		jpql.append("CONTRATO.DES_CONTRATO C_DESCON, ");// -- (09) Descripción del contrato
		jpql.append("CAST (MONEDAS.DESCRIPCION AS VARCHAR2(50)) C_TIPMON, ");// -- (10) Tipo de moneda
		jpql.append("CAST (CONTRATO.M_CONTRATADO AS NUMBER) N_MONTO, ");// -- (11) Monto del Contrato
		jpql.append("CONTRATO.F_CONTRATO FECHA_SUSCRIP_CONTR, ");// -- (12) Corresponde a la fecha en que se suscribió el contrato
		jpql.append("CONTRATO.F_PUBLICA FECHA_PUB_CONTR, ");// -- (13) Corresponde a la fecha y hora de la publicación del contrato en el SEACE
		jpql.append("CONTRATO.F_VIGENCIA_INI FECHA_INI_VIG, ");// -- (14) Corresponde a la fecha de inicio de la vigencia del contrato proyectado
		jpql.append("CONTRATO.F_VIGENCIA_FIN FECHA_FIN_VIG, ");// -- (15) Corresponde a la fecha de fin de la vigencia del contrato proyectado
		jpql.append("CONTRATO.N_COD_CONTRATO ID_CONTRATO, ");// -- (16) Corresponde al Identificador del Contrato
		jpql.append("PROCESO.N_ID_EXPEDE N_ID_EXPEDE ");// -- (17) Corresponde al identificador del expediente, en caso se trate de un proceso convocado en la versión 3.0 del SEACE
		jpql.append("FROM REG_PROCESOS.CONTRATO CONTRATO ");
		jpql.append("INNER JOIN SEASE.ENTIDADUE_ANHO ENTIDADUE_ANHO ON CONTRATO.CODCONSUCODE = ENTIDADUE_ANHO.EUE_CODIGO AND CONTRATO.anhoentidad = entidadue_anho.eue_anho ");
		jpql.append("LEFT OUTER JOIN REG_PROCESOS.MONEDAS MONEDAS ON CONTRATO.mon_codigo = monedas.codmoneda ");
		jpql.append("LEFT OUTER JOIN REG_PROCESOS.TIPO_SITUACION_CONTRACT TIPO_SITUACION_CONTRACT  ON contrato.cod_situacion = tipo_situacion_contract.cod_situacion ");
		jpql.append("LEFT OUTER JOIN REG_PROCESOS.CONVOCATORIA_DOC CONVOCATORIA_DOC ON CONTRATO.N_COD_CONTRATO = CONVOCATORIA_DOC.N_COD_CONTRATO AND convocatoria_doc.cod_tipo_doc = 600 ");
		jpql.append("LEFT OUTER JOIN REG_PROCESOS.CONVOCATORIA_PROPUESTA PROPUESTA ON PROPUESTA.N_PROPUESTA = CONTRATO.N_PROPUESTA ");
		jpql.append("LEFT OUTER JOIN REG_PROCESOS.convocatorias CONVOCATORIA ON CONVOCATORIA.N_CONVOCA = CONTRATO.N_CONVOCA ");
		jpql.append("LEFT OUTER JOIN REG_PROCESOS.PROCESOS PROCESO ON CONVOCATORIA.N_PROCESO = PROCESO.N_PROCESO ");
		jpql.append("LEFT OUTER JOIN REG_PROCESOS.CONSORCIO CONS ON NVL(CONS.N_PROPUESTA,CONTRATO.N_PROPUESTA) = CONTRATO.N_PROPUESTA AND CONS.COD_CONSORCIO = PROPUESTA.COD_CONSORCIO ");
		jpql.append("LEFT OUTER JOIN REG_PROCESOS.CONSORCIO_MIEMBRO CM ON CM.COD_CONSORCIO = CONS.COD_CONSORCIO ");
		jpql.append("LEFT OUTER JOIN REG_PROCESOS.tipo_procesos TIPO_PROCESO ON TIPO_PROCESO.PROC_TIPO = CONVOCATORIA.proc_tipo ");
		jpql.append("LEFT OUTER JOIN REG_PROCESOS.OBJETO OBJETO ON CONVOCATORIA.CODOBJETO = OBJETO.CODOBJETO  ");
		jpql.append("WHERE 1 = 1 ");

		if (reqRucCodContra) {
			jpql.append("AND PROPUESTA.RUC_POSTOR = :rucContratista ");
		}

		if (reqFecEntContra) {
			jpql.append("AND ENTIDADUE_ANHO.EUE_RUC = :rucEntidad ");
		}

		if (reqFecSuscContr) {
			jpql.append("AND TO_CHAR(TRUNC(CONTRATO.F_CONTRATO),'DD/MM/YYYY') = :fechaSuscripcion ");
		}

		jpql.append("ORDER BY CONTRATO.F_PUBLICA ");

		Query query = em1.createNativeQuery(jpql.toString());

		if (reqRucCodContra) {
			query.setParameter("rucContratista", customerRequest.getRucCodigoContratista().toUpperCase());
		}

		if (reqFecEntContra) {
			query.setParameter("rucEntidad", customerRequest.getRucEntidadContratante().toUpperCase());
		}

		if (reqFecSuscContr) {
			query.setParameter("fechaSuscripcion", customerRequest.getFechaSuscripcionContrato());
		}

		List<Object[]> lista = query.getResultList();

		for (Object[] contObj : lista) {
			ContratoDto contrato = new ContratoDto();
			contrato.setRucCodigoContratista(contObj[0] != null ? contObj[0].toString() : null);
			contrato.setNombreRazonSocialContratista(contObj[1] != null ? contObj[1].toString() : null);
			contrato.setEsConsorcio(contObj[2] != null ? TipoIndConsorciaType.get(contObj[2].toString()).getValue() : null);
			contrato.setRucEntidadContratante(contObj[3] != null ? contObj[3].toString() : null);
			contrato.setNombreEntidadContratante(contObj[4] != null ? contObj[4].toString() : null);
			contrato.setNomenclaturaProceso(contObj[5] != null ? contObj[5].toString() : null);
			contrato.setObjetoContratacion(contObj[6] != null ? contObj[6].toString() : null);
			contrato.setNumeroContrato(contObj[7] != null ? contObj[7].toString() : null);
			contrato.setDescripcionContrato(contObj[8] != null ? contObj[8].toString() : null);
			contrato.setTipoMoneda(contObj[9] != null ? contObj[9].toString() : "");
			contrato.setMontoContrato(contObj[10] != null ? (new BigDecimal(contObj[10].toString())) : null);
			contrato.setFechaSuscripcionContrato(contObj[11] != null ? FechaUtil.obtenerFechaFormatoSimple((Date) contObj[11], "dd/MM/yyyy") : null);
			contrato.setFechaPublicacion(contObj[12] != null ? FechaUtil.obtenerFechaFormatoSimple((Date) contObj[12], "dd/MM/yyyy HH:mm") : null);
			contrato.setFechaInicioVigenciaProgramado(contObj[13] != null ? FechaUtil.obtenerFechaFormatoSimple((Date) contObj[13], "dd/MM/yyyy") : null);
			contrato.setFechaFinVigenciaProgramado(contObj[14] != null ? FechaUtil.obtenerFechaFormatoSimple((Date) contObj[14], "dd/MM/yyyy") : null);
			contrato.setIdContrato(contObj[15] != null ? new Long(contObj[15].toString()) : null);
			contrato.setIdExpediente(contObj[16] != null ? new Long(contObj[16].toString()) : null);
			if (contObj[16] != null) {
				this.cargarProyectosInversion(contObj[16].toString(), contrato);
			}
			contratos.add(contrato);
		}
		
		return contratos;
	}
	
	private void cargarProyectosInversion(String idExpediente, ContratoDto contrato) {
		StringBuilder jpql = new StringBuilder();
		
		jpql.append(" SELECT DISTINCT C_CUI C_CUI,C_CUI_ENTIDAD C_CUI_ENTIDAD,C_CUI_PROYECTO C_CUI_PROYECTO  from ( "); 
		jpql.append(" SELECT * FROM ( SELECT  N_ID_EXPEDE,C_CUI,C_CUI_ENTIDAD,C_CUI_PROYECTO FROM PRO.DET_ACT_EXP_PRES_MFIS WHERE C_CUI IS NOT NULL AND C_CUI != '-'   ");
		jpql.append(" UNION SELECT N_ID_EXPEDE,C_CUI,C_CUI_ENTIDAD,C_CUI_PROYECTO FROM PRO.DET_ACT_EXP_PRES_CREPRE WHERE C_CUI IS NOT NULL AND C_CUI != '-'  ");
		jpql.append(" UNION SELECT N_ID_EXPEDE,C_CUI,C_CUI_ENTIDAD,C_CUI_PROYECTO FROM PRO.DET_ACT_EXP_PRES_FONPRI WHERE C_CUI IS NOT NULL AND C_CUI != '-'))  ");
		jpql.append(" WHERE N_ID_EXPEDE = :idExpediente ");
		Query query = em2.createNativeQuery(jpql.toString());
		query.setParameter("idExpediente", idExpediente);
		
		List<Object[]> listaObjeto = query.getResultList();
		for (Object[] contObj : listaObjeto) {
			ProyectoInversionDto proyecto = new ProyectoInversionDto();
			proyecto.setCodigoUnicoInversion(contObj[0]!=null ? contObj[0].toString() : null);
			proyecto.setNombreEntidad(contObj[1]!=null ? contObj[1].toString() : null);
			proyecto.setNombreProyectoInversion(contObj[2]!=null ? contObj[2].toString() : null);
			contrato.getProyectos().add(proyecto);
		}

	}
	
}
