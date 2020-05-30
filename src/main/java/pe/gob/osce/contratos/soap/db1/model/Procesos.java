package pe.gob.osce.contratos.soap.db1.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PROCESOS", schema = "REG_PROCESOS")
public class Procesos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "N_ID_PROCESO")
    private Long id;
    @Column(name = "N_ID_EXPEDE")
    private Long expediente;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getExpediente() {
		return expediente;
	}
	public void setExpediente(Long expediente) {
		this.expediente = expediente;
	}
	
	
}