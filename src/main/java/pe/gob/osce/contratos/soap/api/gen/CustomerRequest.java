//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.05.27 a las 06:22:58 PM COT 
//


package pe.gob.osce.contratos.soap.api.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rucCodigoContratista" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rucEntidadContratante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaSuscripcionContrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rucCodigoContratista",
    "rucEntidadContratante",
    "fechaSuscripcionContrato"
})
@XmlRootElement(name = "CustomerRequest")
public class CustomerRequest {

    @XmlElement(required = true)
    protected String rucCodigoContratista;
    @XmlElement(required = true)
    protected String rucEntidadContratante;
    @XmlElement(required = true)
    protected String fechaSuscripcionContrato;

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

}
