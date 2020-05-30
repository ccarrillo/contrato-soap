package pe.gob.osce.contratos.soap.dto;

public class ProyectoInversionDto {
	
	private String codigoUnicoInversion;
	
	private String nombreEntidad;

	private String nombreProyectoInversion;

	public String getCodigoUnicoInversion() {
		return codigoUnicoInversion;
	}

	public void setCodigoUnicoInversion(String codigoUnicoInversion) {
		this.codigoUnicoInversion = codigoUnicoInversion;
	}

	public String getNombreEntidad() {
		return nombreEntidad;
	}

	public void setNombreEntidad(String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;
	}

	public String getNombreProyectoInversion() {
		return nombreProyectoInversion;
	}

	public void setNombreProyectoInversion(String nombreProyectoInversion) {
		this.nombreProyectoInversion = nombreProyectoInversion;
	}

}
