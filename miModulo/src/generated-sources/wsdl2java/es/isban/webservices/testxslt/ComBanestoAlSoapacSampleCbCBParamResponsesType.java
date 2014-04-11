
package es.isban.webservices.testxslt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para com.banesto.al.soapac.sample.cb.CB_ParamResponses_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="com.banesto.al.soapac.sample.cb.CB_ParamResponses_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParamResponse" type="{http://www.isban.es/webservices/BLOCK/Sample/F_soapac_sample/banesto/internet/cbTypes/vDraft}com.banesto.al.soapac.sample.cb.CB_ParamResponse_Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.banesto.al.soapac.sample.cb.CB_ParamResponses_Type", namespace = "http://www.isban.es/webservices/BLOCK/Sample/F_soapac_sample/banesto/internet/cbTypes/vDraft", propOrder = {
    "paramResponse"
})
public class ComBanestoAlSoapacSampleCbCBParamResponsesType {

    @XmlElement(name = "ParamResponse", nillable = true)
    protected List<ComBanestoAlSoapacSampleCbCBParamResponseType> paramResponse;

    /**
     * Gets the value of the paramResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paramResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParamResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComBanestoAlSoapacSampleCbCBParamResponseType }
     * 
     * 
     */
    public List<ComBanestoAlSoapacSampleCbCBParamResponseType> getParamResponse() {
        if (paramResponse == null) {
            paramResponse = new ArrayList<ComBanestoAlSoapacSampleCbCBParamResponseType>();
        }
        return this.paramResponse;
    }

}
