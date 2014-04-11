
package es.isban.webservices.testivr;

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
 *         &lt;element name="faultCode" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_GENERAL_Type"/>
 *         &lt;element name="code" type="{http://www.gruposantander.es/webservices/genericFault}faultcode"/>
 *         &lt;element name="reasons" type="{http://www.gruposantander.es/webservices/genericFault}faultreasons"/>
 *         &lt;element name="processInfo" type="{http://www.gruposantander.es/webservices/genericFault}ProcessInfo"/>
 *         &lt;element name="technicalException" type="{http://www.gruposantander.es/webservices/genericFault}TechnicalException"/>
 *         &lt;element name="additionalInfo" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_EXTRALARGA_Type"/>
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
    "faultCode",
    "code",
    "reasons",
    "processInfo",
    "technicalException",
    "additionalInfo"
})
@XmlRootElement(name = "Exception")
public class Exception {

    @XmlElement(required = true)
    protected String faultCode;
    @XmlElement(required = true)
    protected Faultcode code;
    @XmlElement(required = true)
    protected Faultreasons reasons;
    @XmlElement(required = true)
    protected ProcessInfo processInfo;
    @XmlElement(required = true)
    protected TechnicalException technicalException;
    @XmlElement(required = true)
    protected String additionalInfo;

    /**
     * Obtiene el valor de la propiedad faultCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultCode() {
        return faultCode;
    }

    /**
     * Define el valor de la propiedad faultCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultCode(String value) {
        this.faultCode = value;
    }

    /**
     * Obtiene el valor de la propiedad code.
     * 
     * @return
     *     possible object is
     *     {@link Faultcode }
     *     
     */
    public Faultcode getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     * @param value
     *     allowed object is
     *     {@link Faultcode }
     *     
     */
    public void setCode(Faultcode value) {
        this.code = value;
    }

    /**
     * Obtiene el valor de la propiedad reasons.
     * 
     * @return
     *     possible object is
     *     {@link Faultreasons }
     *     
     */
    public Faultreasons getReasons() {
        return reasons;
    }

    /**
     * Define el valor de la propiedad reasons.
     * 
     * @param value
     *     allowed object is
     *     {@link Faultreasons }
     *     
     */
    public void setReasons(Faultreasons value) {
        this.reasons = value;
    }

    /**
     * Obtiene el valor de la propiedad processInfo.
     * 
     * @return
     *     possible object is
     *     {@link ProcessInfo }
     *     
     */
    public ProcessInfo getProcessInfo() {
        return processInfo;
    }

    /**
     * Define el valor de la propiedad processInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessInfo }
     *     
     */
    public void setProcessInfo(ProcessInfo value) {
        this.processInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad technicalException.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalException }
     *     
     */
    public TechnicalException getTechnicalException() {
        return technicalException;
    }

    /**
     * Define el valor de la propiedad technicalException.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalException }
     *     
     */
    public void setTechnicalException(TechnicalException value) {
        this.technicalException = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Define el valor de la propiedad additionalInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

}
