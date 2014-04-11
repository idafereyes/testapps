
package es.isban.webservices.testxslt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TechnicalException complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TechnicalException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="technicalPlatform" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_GENERAL_Type"/>
 *         &lt;element name="platformCode" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_GENERAL_Type"/>
 *         &lt;element name="message" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_EXTRALARGA_Type"/>
 *         &lt;element name="stackTrace" type="{http://www.isban.es/webservices/TDCs}TEXTO_MULTILINEA_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TechnicalException", propOrder = {
    "technicalPlatform",
    "platformCode",
    "message",
    "stackTrace"
})
public class TechnicalException {

    @XmlElement(required = true)
    protected String technicalPlatform;
    @XmlElement(required = true)
    protected String platformCode;
    @XmlElement(required = true)
    protected String message;
    @XmlElement(required = true)
    protected String stackTrace;

    /**
     * Obtiene el valor de la propiedad technicalPlatform.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicalPlatform() {
        return technicalPlatform;
    }

    /**
     * Define el valor de la propiedad technicalPlatform.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicalPlatform(String value) {
        this.technicalPlatform = value;
    }

    /**
     * Obtiene el valor de la propiedad platformCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformCode() {
        return platformCode;
    }

    /**
     * Define el valor de la propiedad platformCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformCode(String value) {
        this.platformCode = value;
    }

    /**
     * Obtiene el valor de la propiedad message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Define el valor de la propiedad message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Obtiene el valor de la propiedad stackTrace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStackTrace() {
        return stackTrace;
    }

    /**
     * Define el valor de la propiedad stackTrace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStackTrace(String value) {
        this.stackTrace = value;
    }

}
