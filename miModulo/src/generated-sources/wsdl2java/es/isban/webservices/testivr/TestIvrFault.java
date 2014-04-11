
package es.isban.webservices.testivr;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.8
 * 2014-04-11T09:32:51.893+02:00
 * Generated source version: 2.7.8
 */

@WebFault(name = "Exception", targetNamespace = "http://www.gruposantander.es/webservices/genericFault")
public class TestIvrFault extends java.lang.Exception {
    
    private es.isban.webservices.testivr.Exception exception;

    public TestIvrFault() {
        super();
    }
    
    public TestIvrFault(String message) {
        super(message);
    }
    
    public TestIvrFault(String message, Throwable cause) {
        super(message, cause);
    }

    public TestIvrFault(String message, es.isban.webservices.testivr.Exception exception) {
        super(message);
        this.exception = exception;
    }

    public TestIvrFault(String message, es.isban.webservices.testivr.Exception exception, Throwable cause) {
        super(message, cause);
        this.exception = exception;
    }

    public es.isban.webservices.testivr.Exception getFaultInfo() {
        return this.exception;
    }
}
