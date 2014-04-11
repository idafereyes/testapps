
package es.isban.webservices.testivr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProcessInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProcessInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="processIncomingMessage" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_GENERAL_Type"/>
 *         &lt;element name="processID" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_GENERAL_Type"/>
 *         &lt;element name="processName" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_GENERAL_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessInfo", propOrder = {
    "processIncomingMessage",
    "processID",
    "processName"
})
public class ProcessInfo {

    @XmlElement(required = true)
    protected String processIncomingMessage;
    @XmlElement(required = true)
    protected String processID;
    @XmlElement(required = true)
    protected String processName;

    /**
     * Obtiene el valor de la propiedad processIncomingMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessIncomingMessage() {
        return processIncomingMessage;
    }

    /**
     * Define el valor de la propiedad processIncomingMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessIncomingMessage(String value) {
        this.processIncomingMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad processID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessID() {
        return processID;
    }

    /**
     * Define el valor de la propiedad processID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessID(String value) {
        this.processID = value;
    }

    /**
     * Obtiene el valor de la propiedad processName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessName() {
        return processName;
    }

    /**
     * Define el valor de la propiedad processName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessName(String value) {
        this.processName = value;
    }

}
