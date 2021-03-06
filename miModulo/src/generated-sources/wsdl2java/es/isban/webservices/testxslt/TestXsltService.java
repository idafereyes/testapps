package es.isban.webservices.testxslt;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2014-12-05T11:29:12.013+01:00
 * Generated source version: 2.7.8
 * 
 */
@WebServiceClient(name = "TestXslt_Service", 
                  wsdlLocation = "http://localhost/wsdl/TestXslt_vDraft.wsdl",
                  targetNamespace = "http://www.isban.es/webservices/BLOCK/Sample/F_soapac_sample/internet/TestIvr/vDraft") 
public class TestXsltService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.isban.es/webservices/BLOCK/Sample/F_soapac_sample/internet/TestIvr/vDraft", "TestXslt_Service");
    public final static QName TestXsltPortHTTP = new QName("http://www.isban.es/webservices/BLOCK/Sample/F_soapac_sample/internet/TestIvr/vDraft", "TestXsltPortHTTP");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost/wsdl/TestXslt_vDraft.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TestXsltService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost/wsdl/TestXslt_vDraft.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public TestXsltService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TestXsltService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TestXsltService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TestXsltService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TestXsltService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TestXsltService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns TestXsltPortTypeHTTP
     */
    @WebEndpoint(name = "TestXsltPortHTTP")
    public TestXsltPortTypeHTTP getTestXsltPortHTTP() {
        return super.getPort(TestXsltPortHTTP, TestXsltPortTypeHTTP.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TestXsltPortTypeHTTP
     */
    @WebEndpoint(name = "TestXsltPortHTTP")
    public TestXsltPortTypeHTTP getTestXsltPortHTTP(WebServiceFeature... features) {
        return super.getPort(TestXsltPortHTTP, TestXsltPortTypeHTTP.class, features);
    }

}
