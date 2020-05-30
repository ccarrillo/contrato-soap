package pe.gob.osce.contratos.soap.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ContratoDto {
	
	private String rucCodigoContratista;

	private String nombreRazonSocialContratista;

	private String esConsorcio;

	private String rucEntidadContratante;

	private String nombreEntidadContratante;

	private String nomenclaturaProceso;

	private String objetoContratacion;

	private String numeroContrato;

	private String descripcionContrato;

	private String tipoMoneda;

	private BigDecimal montoContrato;

	private String fechaSuscripcionContrato;

	private String fechaPublicacion;

	private String fechaInicioVigenciaProgramado;

	private String fechaFinVigenciaProgramado;

	private Long idContrato;

	private Long idOperacion;

	private Long idExpediente;
	
	private List<ProyectoInversionDto> proyectos = new ArrayList<>();

	public String getRucCodigoContratista() {
		return rucCodigoContratista;
	}

	public void setRucCodigoContratista(String rucCodigoContratista) {
		this.rucCodigoContratista = rucCodigoContratista;
	}

	public String getNombreRazonSocialContratista() {
		return nombreRazonSocialContratista;
	}

	public void setNombreRazonSocialContratista(String nombreRazonSocialContratista) {
		this.nombreRazonSocialContratista = nombreRazonSocialContratista;
	}

	public String getEsConsorcio() {
		return esConsorcio;
	}

	public void setEsConsorcio(String esConsorcio) {
		this.esConsorcio = esConsorcio;
	}

	public String getRucEntidadContratante() {
		return rucEntidadContratante;
	}

	public void setRucEntidadContratante(String rucEntidadContratante) {
		this.rucEntidadContratante = rucEntidadContratante;
	}

	public String getNombreEntidadContratante() {
		return nombreEntidadContratante;
	}

	public void setNombreEntidadContratante(String nombreEntidadContratante) {
		this.nombreEntidadContratante = nombreEntidadContratante;
	}

	public String getNomenclaturaProceso() {
		return nomenclaturaProceso;
	}

	public void setNomenclaturaProceso(String nomenclaturaProceso) {
		this.nomenclaturaProceso = nomenclaturaProceso;
	}

	public String getObjetoContratacion() {
		return objetoContratacion;
	}

	public void setObjetoContratacion(String objetoContratacion) {
		this.objetoContratacion = objetoContratacion;
	}

	public String getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public String getDescripcionContrato() {
		return descripcionContrato;
	}

	public void setDescripcionContrato(String descripcionContrato) {
		this.descripcionContrato = descripcionContrato;
	}

	public String getTipoMoneda() {
		return tipoMoneda;
	}

	public void setTipoMoneda(String tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}

	public BigDecimal getMontoContrato() {
		return montoContrato;
	}

	public void setMontoContrato(BigDecimal montoContrato) {
		this.montoContrato = montoContrato;
	}

	public String getFechaSuscripcionContrato() {
		return fechaSuscripcionContrato;
	}

	public void setFechaSuscripcionContrato(String fechaSuscripcionContrato) {
		this.fechaSuscripcionContrato = fechaSuscripcionContrato;
	}

	public String getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(String fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public String getFechaInicioVigenciaProgramado() {
		return fechaInicioVigenciaProgramado;
	}

	public void setFechaInicioVigenciaProgramado(String fechaInicioVigenciaProgramado) {
		this.fechaInicioVigenciaProgramado = fechaInicioVigenciaProgramado;
	}

	public String getFechaFinVigenciaProgramado() {
		return fechaFinVigenciaProgramado;
	}

	public void setFechaFinVigenciaProgramado(String fechaFinVigenciaProgramado) {
		this.fechaFinVigenciaProgramado = fechaFinVigenciaProgramado;
	}

	public Long getIdContrato() {
		return idContrato;
	}

	public void setIdContrato(Long idContrato) {
		this.idContrato = idContrato;
	}

	public Long getIdOperacion() {
		return idOperacion;
	}

	public void setIdOperacion(Long idOperacion) {
		this.idOperacion = idOperacion;
	}

	public Long getIdExpediente() {
		return idExpediente;
	}

	public void setIdExpediente(Long idExpediente) {
		this.idExpediente = idExpediente;
	}

	public List<ProyectoInversionDto> getProyectos() {
		return proyectos;
	}

	public void setProyectos(List<ProyectoInversionDto> proyectos) {
		this.proyectos = proyectos;
	}

}
