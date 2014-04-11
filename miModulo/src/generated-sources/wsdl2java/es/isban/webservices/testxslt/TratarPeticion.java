
package es.isban.webservices.testxslt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="entrada" type="{http://www.isban.es/webservices/BLOCK/Sample/F_soapac_sample/banesto/internet/cbTypes/vDraft}com.banesto.al.soapac.sample.cb.CB_ServDocNoConc_E_Type"/>
 *       &lt;/sequence>
 *       &lt;attribute name="facade" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_GENERAL_Type" fixed="TestXslt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "entrada"
})
@XmlRootElement(name = "tratarPeticion", namespace = "http://www.isban.es/webservices/BLOCK/Sample/F_soapac_sample/internet/TestIvr/vDraft")
public class TratarPeticion {

    @XmlElement(required = true, nillable = true)
    protected ComBanestoAlSoapacSampleCbCBServDocNoConcEType entrada;
    @XmlAttribute(name = "facade")
    protected String facade;

    /**
     * Obtiene el valor de la propiedad entrada.
     * 
     * @return
     *     possible object is
     *     {@link ComBanestoAlSoapacSampleCbCBServDocNoConcEType }
     *     
     */
    public ComBanestoAlSoapacSampleCbCBServDocNoConcEType getEntrada() {
        return entrada;
    }

    /**
     * Define el valor de la propiedad entrada.
     * 
     * @param value
     *     allowed object is
     *     {@link ComBanestoAlSoapacSampleCbCBServDocNoConcEType }
     *     
     */
    public void setEntrada(ComBanestoAlSoapacSampleCbCBServDocNoConcEType value) {
        this.entrada = value;
    }

    /**
     * Obtiene el valor de la propiedad facade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacade() {
        if (facade == null) {
            return "TestXslt";
        } else {
            return facade;
        }
    }

    /**
     * Define el valor de la propiedad facade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacade(String value) {
        this.facade = value;
    }

}
