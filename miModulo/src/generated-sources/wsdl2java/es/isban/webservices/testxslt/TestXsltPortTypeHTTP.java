package es.isban.webservices.testxslt;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2014-04-15T15:28:59.157+02:00
 * Generated source version: 2.7.8
 * 
 */
@WebService(targetNamespace = "http://www.isban.es/webservices/BLOCK/Sample/F_soapac_sample/internet/TestIvr/vDraft", name = "TestXsltPortTypeHTTP")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface TestXsltPortTypeHTTP {

    @WebResult(name = "testAltairResponse", targetNamespace = "http://www.isban.es/webservices/BLOCK/Sample/F_soapac_sample/internet/TestIvr/vDraft", partName = "testAltair_OutputPart")
    @WebMethod(action = "http://www.isban.es/webservices/BLOCK/Sample/F_soapac_sample/internet/TestXslt/vDraft/testAltair")
    public TestAltairResponse testAltair(
        @WebParam(partName = "testAltair_InputPart", name = "testAltair", targetNamespace = "http://www.isban.es/webservices/BLOCK/Sample/F_soapac_sample/internet/TestIvr/vDraft")
        TestAltair testAltairInputPart
    ) throws TestAltairFault;

    @WebResult(name = "tratarPeticionResponse", targetNamespace = "http://www.isban.es/webservices/BLOCK/Sample/F_soapac_sample/internet/TestIvr/vDraft", partName = "tratarPeticion_OutputPart")
    @WebMethod(action = "http://www.isban.es/webservices/BLOCK/Sample/F_soapac_sample/internet/TestXslt/vDraft/tratarPeticion")
    public TratarPeticionResponse tratarPeticion(
        @WebParam(partName = "tratarPeticion_InputPart", name = "tratarPeticion", targetNamespace = "http://www.isban.es/webservices/BLOCK/Sample/F_soapac_sample/internet/TestIvr/vDraft")
        TratarPeticion tratarPeticionInputPart
    ) throws TratarPeticionFault;
}
