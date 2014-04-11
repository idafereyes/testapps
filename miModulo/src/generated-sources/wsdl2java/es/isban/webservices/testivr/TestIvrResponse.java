
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
 *         &lt;element name="methodResult" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_CORTA_Type"/>
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
    "methodResult"
})
@XmlRootElement(name = "testIvrResponse", namespace = "http://www.isban.es/webservices/BLOCK/Sample/F_soapac_sample/internet/TestIvr/vDraft")
public class TestIvrResponse {

    @XmlElement(required = true)
    protected String methodResult;

    /**
     * Obtiene el valor de la propiedad methodResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodResult() {
        return methodResult;
    }

    /**
     * Define el valor de la propiedad methodResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodResult(String value) {
        this.methodResult = value;
    }

}
