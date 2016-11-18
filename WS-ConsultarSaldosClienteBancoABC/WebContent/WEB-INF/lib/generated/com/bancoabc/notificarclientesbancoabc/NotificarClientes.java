
package com.bancoabc.notificarclientesbancoabc;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="correoElectronico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tipoId",
    "numId",
    "correoElectronico"
})
@XmlRootElement(name = "NotificarClientes")
public class NotificarClientes {

    @XmlElement(required = true)
    protected String tipoId;
    @XmlElement(required = true)
    protected String numId;
    @XmlElement(required = true)
    protected String correoElectronico;

    /**
     * Obtiene el valor de la propiedad tipoId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoId() {
        return tipoId;
    }

    /**
     * Define el valor de la propiedad tipoId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoId(String value) {
        this.tipoId = value;
    }

    /**
     * Obtiene el valor de la propiedad numId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumId() {
        return numId;
    }

    /**
     * Define el valor de la propiedad numId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumId(String value) {
        this.numId = value;
    }

    /**
     * Obtiene el valor de la propiedad correoElectronico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Define el valor de la propiedad correoElectronico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoElectronico(String value) {
        this.correoElectronico = value;
    }

}
