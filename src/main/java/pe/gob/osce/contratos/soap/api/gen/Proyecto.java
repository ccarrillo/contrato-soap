//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.05.30 a las 06:50:28 PM COT 
//


package pe.gob.osce.contratos.soap.api.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para proyecto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="proyecto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoUnicoInversion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreEntidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreProyectoInversion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proyecto", propOrder = {
    "codigoUnicoInversion",
    "nombreEntidad",
    "nombreProyectoInversion"
})
public class Proyecto {

    @XmlElement(required = true)
    protected String codigoUnicoInversion;
    @XmlElement(required = true)
    protected String nombreEntidad;
    @XmlElement(required = true)
    protected String nombreProyectoInversion;

    /**
     * Obtiene el valor de la propiedad codigoUnicoInversion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUnicoInversion() {
        return codigoUnicoInversion;
    }

    /**
     * Define el valor de la propiedad codigoUnicoInversion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUnicoInversion(String value) {
        this.codigoUnicoInversion = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEntidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEntidad() {
        return nombreEntidad;
    }

    /**
     * Define el valor de la propiedad nombreEntidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEntidad(String value) {
        this.nombreEntidad = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreProyectoInversion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreProyectoInversion() {
        return nombreProyectoInversion;
    }

    /**
     * Define el valor de la propiedad nombreProyectoInversion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreProyectoInversion(String value) {
        this.nombreProyectoInversion = value;
    }

}
