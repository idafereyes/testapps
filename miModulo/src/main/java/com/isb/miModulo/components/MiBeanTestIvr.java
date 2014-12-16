package com.isb.miModulo.components;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.vectorsf.jvoiceframework.core.service.ws.WebServiceProvider;

import es.isban.webservices.testivr.ObjectFactory;
import es.isban.webservices.testivr.TestIvr;
import es.isban.webservices.testivr.TestIvrPortTypeHTTP;
import es.isban.webservices.testivr.TestIvrResponse;

@Component("miBeanTestIvr")
@Scope("prototype")
//@Scope(value = "singleton", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class MiBeanTestIvr implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private WebServiceProvider webServiceProvider;
	
	public void testWs(){
		
		System.out.println("********testWs");

		TestIvrPortTypeHTTP webservice = webServiceProvider.getClient(TestIvrPortTypeHTTP.class, "TestIvrSecond");
		
		ObjectFactory obj = new ObjectFactory();
		
		TestIvr testIvr = obj.createTestIvr();
		testIvr.setFacade("TestIvr");
		
		testIvr.setParam1("Holaaa caracolaaa");
		
		try {
			TestIvrResponse response = webservice.testIvr(testIvr);
			System.out.println("********Respuesta: " + response.getMethodResult());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	

}
