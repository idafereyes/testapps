
package es.isban.webservices.testxslt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
@XmlType(name = "")
@XmlRootElement(name = "testAltair", namespace = "http://www.isban.es/webservices/BLOCK/Sample/F_soapac_sample/internet/TestIvr/vDraft")
public class TestAltair {

    @XmlAttribute(name = "facade")
    protected String facade;

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
