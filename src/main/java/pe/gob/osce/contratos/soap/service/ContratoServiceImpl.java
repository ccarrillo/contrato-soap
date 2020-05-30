package pe.gob.osce.contratos.soap.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.osce.contratos.soap.api.gen.Contrato;
import pe.gob.osce.contratos.soap.api.gen.CustomerRequest;
import pe.gob.osce.contratos.soap.api.gen.CustomerResponse;
import pe.gob.osce.contratos.soap.api.gen.Proyecto;
import pe.gob.osce.contratos.soap.dao.ContratoRepository;
import pe.gob.osce.contratos.soap.dto.ContratoDto;
import pe.gob.osce.contratos.soap.utils.FechaUtil;
import pe.gob.osce.contratos.soap.utils.MensajeResponseType;

@Service
public class ContratoServiceImpl implements ContratoService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ContratoRepository contratoRepository;

	@Override
	public CustomerResponse obtenerContrato(CustomerRequest request) {
		CustomerResponse response = new CustomerResponse();
		boolean parametrosCorrectos = true;
		
		try {
			if (request.getRucCodigoContratista() == null || request.getRucCodigoContratista().isEmpty()) {
				response.setCodigoError(MensajeResponseType.MSJ_DATOS_OBLIGATORIOS.getKey());
				response.setMensajeError(MensajeResponseType.MSJ_DATOS_OBLIGATORIOS.getValue());
				parametrosCorrectos = false;
			} else if (request.getRucEntidadContratante() == null || request.getRucEntidadContratante().isEmpty()) {
				response.setCodigoError(MensajeResponseType.MSJ_DATOS_OBLIGATORIOS.getKey());
				response.setMensajeError(MensajeResponseType.MSJ_DATOS_OBLIGATORIOS.getValue());
				parametrosCorrectos = false;
			} else if (request.getFechaSuscripcionContrato() != null && !request.getFechaSuscripcionContrato().isEmpty()) {
				if (FechaUtil.obtenerFechaFormatoPersonalizado(request.getFechaSuscripcionContrato(), "dd/MM/yyyy") == null) {
					response.setCodigoError(MensajeResponseType.MSJ_ESTRUCTURA_FORMATO_INVALIDO.getKey());
					response.setMensajeError(MensajeResponseType.MSJ_ESTRUCTURA_FORMATO_INVALIDO.getValue());
					parametrosCorrectos = false;
				}
			}
			
			if (parametrosCorrectos) {
				List<ContratoDto> contratosdto = contratoRepository.cargarContratos(request);
				contratosdto.forEach(obj -> {
					Contrato contrato = new Contrato();
					contrato.setRucCodigoContratista(obj.getRucCodigoContratista());
					contrato.setNombreRazonSocialContratista(obj.getNombreRazonSocialContratista());
					contrato.setEsConsorcio(obj.getEsConsorcio());
					contrato.setRucEntidadContratante(obj.getRucEntidadContratante());
					contrato.setNombreEntidadContratante(obj.getNombreEntidadContratante());
					contrato.setNomenclaturaProceso(obj.getNomenclaturaProceso());
					contrato.setObjetoContratacion(obj.getObjetoContratacion());
					contrato.setNumeroContrato(obj.getNumeroContrato());
					contrato.setDescripcionContrato(obj.getDescripcionContrato());
					contrato.setTipoMoneda(obj.getTipoMoneda());
					contrato.setMontoContrato(obj.getMontoContrato());
					contrato.setFechaSuscripcionContrato(obj.getFechaSuscripcionContrato());
					contrato.setFechaPublicacion(obj.getFechaPublicacion());
					contrato.setFechaInicioVigenciaProgramado(obj.getFechaInicioVigenciaProgramado());
					contrato.setFechaFinVigenciaProgramado(obj.getFechaFinVigenciaProgramado());
					contrato.setIdContrato(obj.getIdContrato());
					contrato.setIdExpediente(obj.getIdExpediente());
					obj.getProyectos().forEach(obj2 -> {
						Proyecto proyecto = new Proyecto();
						proyecto.setCodigoUnicoInversion(obj2.getCodigoUnicoInversion());
						proyecto.setNombreEntidad(obj2.getNombreEntidad());
						proyecto.setNombreProyectoInversion(obj2.getNombreProyectoInversion());
						contrato.getProyecto().add(proyecto);
					});
					response.getContrato().add(contrato);
				});
				response.setCodigoError(MensajeResponseType.MSJ_OPERACION_COMPLETADA.getKey());
				response.setMensajeError(MensajeResponseType.MSJ_OPERACION_COMPLETADA.getValue());
			}
		} catch (Exception e) {
			response.setCodigoError(MensajeResponseType.MSJ_ERROR_PLATAFORMA.getKey());
			response.setMensajeError(MensajeResponseType.MSJ_ERROR_PLATAFORMA.getValue());
			logger.error(e.getLocalizedMessage());
		}
		
		return response;
	}
	
}
