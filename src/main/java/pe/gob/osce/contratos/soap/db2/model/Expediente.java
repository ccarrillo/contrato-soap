package pe.gob.osce.contratos.soap.db2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_ACT_EXPEDIENTE", schema = "PRO")
public class Expediente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "N_ID_EXPEDE")
    private Long id;
    @Column(name = "N_ID_ORGAN")
    private Long organizacion;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getOrganizacion() {
		return organizacion;
	}
	public void setOrganizacion(Long organizacion) {
		this.organizacion = organizacion;
	}
	
}