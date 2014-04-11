
package es.isban.webservices.testxslt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para com.banesto.al.soapac.sample.cb.CB_ServDocNoConc_E_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="com.banesto.al.soapac.sample.cb.CB_ServDocNoConc_E_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParamResponses" type="{http://www.isban.es/webservices/BLOCK/Sample/F_soapac_sample/banesto/internet/cbTypes/vDraft}com.banesto.al.soapac.sample.cb.CB_ParamResponses_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.banesto.al.soapac.sample.cb.CB_ServDocNoConc_E_Type", namespace = "http://www.isban.es/webservices/BLOCK/Sample/F_soapac_sample/banesto/internet/cbTypes/vDraft", propOrder = {
    "paramResponses"
})
public class ComBanestoAlSoapacSampleCbCBServDocNoConcEType {

    @XmlElement(name = "ParamResponses")
    protected ComBanestoAlSoapacSampleCbCBParamResponsesType paramResponses;

    /**
     * Obtiene el valor de la propiedad paramResponses.
     * 
     * @return
     *     possible object is
     *     {@link ComBanestoAlSoapacSampleCbCBParamResponsesType }
     *     
     */
    public ComBanestoAlSoapacSampleCbCBParamResponsesType getParamResponses() {
        return paramResponses;
    }

    /**
     * Define el valor de la propiedad paramResponses.
     * 
     * @param value
     *     allowed object is
     *     {@link ComBanestoAlSoapacSampleCbCBParamResponsesType }
     *     
     */
    public void setParamResponses(ComBanestoAlSoapacSampleCbCBParamResponsesType value) {
        this.paramResponses = value;
    }

}
