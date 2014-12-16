
package es.isban.webservices.testxslt;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.8
 * 2014-12-05T11:29:11.983+01:00
 * Generated source version: 2.7.8
 */

@WebFault(name = "Exception", targetNamespace = "http://www.gruposantander.es/webservices/genericFault")
public class TestAltairFault extends java.lang.Exception {
    
    private es.isban.webservices.testxslt.Exception exception;

    public TestAltairFault() {
        super();
    }
    
    public TestAltairFault(String message) {
        super(message);
    }
    
    public TestAltairFault(String message, Throwable cause) {
        super(message, cause);
    }

    public TestAltairFault(String message, es.isban.webservices.testxslt.Exception exception) {
        super(message);
        this.exception = exception;
    }

    public TestAltairFault(String message, es.isban.webservices.testxslt.Exception exception, Throwable cause) {
        super(message, cause);
        this.exception = exception;
    }

    public es.isban.webservices.testxslt.Exception getFaultInfo() {
        return this.exception;
    }
}
