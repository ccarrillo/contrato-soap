//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.05.27 a las 06:22:58 PM COT 
//


package pe.gob.osce.contratos.soap.api.gen;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para contrato complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="contrato">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rucCodigoContratista" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreRazonSocialContratista" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="esConsorcio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rucEntidadContratante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreEntidadContratante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nomenclaturaProceso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objetoContratacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroContrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descripcionContrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoMoneda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="montoContrato" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="fechaSuscripcionContrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaInicioVigenciaProgramado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaFinVigenciaProgramado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idContrato" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idOperacion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idExpediente" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="proyecto" type="{http://www.osce.gob.pe/contratos/soap/api/gen}proyecto" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contrato", propOrder = {
    "rucCodigoContratista",
    "nombreRazonSocialContratista",
    "esConsorcio",
    "rucEntidadContratante",
    "nombreEntidadContratante",
    "nomenclaturaProceso",
    "objetoContratacion",
    "numeroContrato",
    "descripcionContrato",
    "tipoMoneda",
    "montoContrato",
    "fechaSuscripcionContrato",
    "fechaPublicacion",
    "fechaInicioVigenciaProgramado",
    "fechaFinVigenciaProgramado",
    "idContrato",
    "idOperacion",
    "idExpediente",
    "proyecto"
})
public class Contrato {

    @XmlElement(required = true)
    protected String rucCodigoContratista;
    @XmlElement(required = true)
    protected String nombreRazonSocialContratista;
    @XmlElement(required = true)
    protected String esConsorcio;
    @XmlElement(required = true)
    protected String rucEntidadContratante;
    @XmlElement(required = true)
    protected String nombreEntidadContratante;
    @XmlElement(required = true)
    protected String nomenclaturaProceso;
    @XmlElement(required = true)
    protected String objetoContratacion;
    @XmlElement(required = true)
    protected String numeroContrato;
    @XmlElement(required = true)
    protected String descripcionContrato;
    @XmlElement(required = true)
    protected String tipoMoneda;
    @XmlElement(required = true)
    protected BigDecimal montoContrato;
    @XmlElement(required = true)
    protected String fechaSuscripcionContrato;
    @XmlElement(required = true)
    protected String fechaPublicacion;
    @XmlElement(required = true)
    protected String fechaInicioVigenciaProgramado;
    @XmlElement(required = true)
    protected String fechaFinVigenciaProgramado;
    protected long idContrato;
    protected long idOperacion;
    protected long idExpediente;
    @XmlElement(required = true)
    protected List<Proyecto> proyecto;

    /**
     * Obtiene el valor de la propiedad rucCodigoContratista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucCodigoContratista() {
        return rucCodigoContratista;
    }

    /**
     * Define el valor de la propiedad rucCodigoContratista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucCodigoContratista(String value) {
        this.rucCodigoContratista = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreRazonSocialContratista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreRazonSocialContratista() {
        return nombreRazonSocialContratista;
    }

    /**
     * Define el valor de la propiedad nombreRazonSocialContratista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreRazonSocialContratista(String value) {
        this.nombreRazonSocialContratista = value;
    }

    /**
     * Obtiene el valor de la propiedad esConsorcio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsConsorcio() {
        return esConsorcio;
    }

    /**
     * Define el valor de la propiedad esConsorcio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsConsorcio(String value) {
        this.esConsorcio = value;
    }

    /**
     * Obtiene el valor de la propiedad rucEntidadContratante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucEntidadContratante() {
        return rucEntidadContratante;
    }

    /**
     * Define el valor de la propiedad rucEntidadContratante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucEntidadContratante(String value) {
        this.rucEntidadContratante = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEntidadContratante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEntidadContratante() {
        return nombreEntidadContratante;
    }

    /**
     * Define el valor de la propiedad nombreEntidadContratante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEntidadContratante(String value) {
        this.nombreEntidadContratante = value;
    }

    /**
     * Obtiene el valor de la propiedad nomenclaturaProceso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomenclaturaProceso() {
        return nomenclaturaProceso;
    }

    /**
     * Define el valor de la propiedad nomenclaturaProceso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomenclaturaProceso(String value) {
        this.nomenclaturaProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad objetoContratacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjetoContratacion() {
        return objetoContratacion;
    }

    /**
     * Define el valor de la propiedad objetoContratacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjetoContratacion(String value) {
        this.objetoContratacion = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroContrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroContrato() {
        return numeroContrato;
    }

    /**
     * Define el valor de la propiedad numeroContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroContrato(String value) {
        this.numeroContrato = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionContrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionContrato() {
        return descripcionContrato;
    }

    /**
     * Define el valor de la propiedad descripcionContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionContrato(String value) {
        this.descripcionContrato = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoMoneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMoneda() {
        return tipoMoneda;
    }

    /**
     * Define el valor de la propiedad tipoMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMoneda(String value) {
        this.tipoMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad montoContrato.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoContrato() {
        return montoContrato;
    }

    /**
     * Define el valor de la propiedad montoContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoContrato(BigDecimal value) {
        this.montoContrato = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaSuscripcionContrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaSuscripcionContrato() {
        return fechaSuscripcionContrato;
    }

    /**
     * Define el valor de la propiedad fechaSuscripcionContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaSuscripcionContrato(String value) {
        this.fechaSuscripcionContrato = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPublicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * Define el valor de la propiedad fechaPublicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPublicacion(String value) {
        this.fechaPublicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicioVigenciaProgramado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInicioVigenciaProgramado() {
        return fechaInicioVigenciaProgramado;
    }

    /**
     * Define el valor de la propiedad fechaInicioVigenciaProgramado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInicioVigenciaProgramado(String value) {
        this.fechaInicioVigenciaProgramado = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFinVigenciaProgramado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFinVigenciaProgramado() {
        return fechaFinVigenciaProgramado;
    }

    /**
     * Define el valor de la propiedad fechaFinVigenciaProgramado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFinVigenciaProgramado(String value) {
        this.fechaFinVigenciaProgramado = value;
    }

    /**
     * Obtiene el valor de la propiedad idContrato.
     * 
     */
    public long getIdContrato() {
        return idContrato;
    }

    /**
     * Define el valor de la propiedad idContrato.
     * 
     */
    public void setIdContrato(long value) {
        this.idContrato = value;
    }

    /**
     * Obtiene el valor de la propiedad idOperacion.
     * 
     */
    public long getIdOperacion() {
        return idOperacion;
    }

    /**
     * Define el valor de la propiedad idOperacion.
     * 
     */
    public void setIdOperacion(long value) {
        this.idOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idExpediente.
     * 
     */
    public long getIdExpediente() {
        return idExpediente;
    }

    /**
     * Define el valor de la propiedad idExpediente.
     * 
     */
    public void setIdExpediente(long value) {
        this.idExpediente = value;
    }

    /**
     * Gets the value of the proyecto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proyecto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProyecto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Proyecto }
     * 
     * 
     */
    public List<Proyecto> getProyecto() {
        if (proyecto == null) {
            proyecto = new ArrayList<Proyecto>();
        }
        return this.proyecto;
    }

}
