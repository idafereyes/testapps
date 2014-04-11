
package es.isban.webservices.testxslt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para com.banesto.al.soapac.sample.cb.CB_ParamResponse_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="com.banesto.al.soapac.sample.cb.CB_ParamResponse_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_BREVE_Type" minOccurs="0"/>
 *         &lt;element name="ValParam" type="{http://www.isban.es/webservices/TDCs}DESCRIPCION_BREVE_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.banesto.al.soapac.sample.cb.CB_ParamResponse_Type", namespace = "http://www.isban.es/webservices/BLOCK/Sample/F_soapac_sample/banesto/internet/cbTypes/vDraft", propOrder = {
    "name",
    "valParam"
})
public class ComBanestoAlSoapacSampleCbCBParamResponseType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ValParam")
    protected String valParam;

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad valParam.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValParam() {
        return valParam;
    }

    /**
     * Define el valor de la propiedad valParam.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValParam(String value) {
        this.valParam = value;
    }

}
