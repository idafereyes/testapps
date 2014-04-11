package com.isb.miModulo.components;


import java.io.Serializable;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.vectorsf.jvoiceframework.core.service.ws.WebServiceProvider;

import es.isban.webservices.testxslt.TestAltair;
import es.isban.webservices.testxslt.TestAltairResponse;
import es.isban.webservices.testxslt.TestXsltPortTypeHTTP;


@Component("miBeanTestAltair")
//@Scope("prototype")
@Scope(value = "singleton", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class MiBeanTestAltair implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4231721470594643762L;
	
	@Autowired
	private WebServiceProvider webServiceProvider;

	
	@PostConstruct
	public void mirarWebServiceProvider() {
		System.out.println("************** webServiceProvider: " + webServiceProvider);
		System.out.println(" **************** webServiceProvider class : " + webServiceProvider.getClass());
		System.out.println("*************** webServiceProvider class name : " + webServiceProvider.getClass().getName());
	}
	
	public void testWS() {
		try
		{
			TestXsltPortTypeHTTP webService = webServiceProvider.getClient(TestXsltPortTypeHTTP.class, "TestXsltPortTypeHTTP");
			
		
			TestAltair testAltairInputPart = new TestAltair();
			testAltairInputPart.setFacade("TestXslt");
			TestAltairResponse response = webService.testAltair(testAltairInputPart);
			System.out.println(response);
//			JWServiceCtasMerchPRResponse2 res = webService.jwServiceCtasMerchPR("", "", "", merchantId);
//			if(res.getCodigoError().isEmpty() && res.getMSJERROR().isEmpty()) {
//				setResult(0);
//				ArrayOfJWServiceCtasMerchPRResponseMerchantItem merchantL = res.getMerchantCtaL();
//				for(JWServiceCtasMerchPRResponseMerchantItem i: merchantL.getJWServiceCtasMerchPRResponseMerchantItem()) {
//					CtaComercio cta = new CtaComercio();
//					cta.setId(i.getIdMerchantCta());
//					cta.setCuenta(i.getMerchantCta());
//					listaCtaComercio.add(cta);
//				}
//			} else {
//				setResult(1);
//			}
		}
		catch (Exception e)
		{
//			setResult(2);
			e.printStackTrace();
		}
	}
}
