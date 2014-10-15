package com.isb.tests.components.p;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vectorsf.jvoiceframework.core.admin.AppConfig;

@Component("com_isb_tests_components_p_UseProperties")
@Scope("prototype")
public class UseProperties implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private AppConfig tests_propsExample;
	
	@Autowired
	private AppConfig tests_xmlExample;
	
	@Autowired
	private MySessionBean mySessionBean;


	public void testProperties(){
		
		System.out.println("tests_propsExample.isXMLFile(): " + tests_propsExample.isXMLFile());
		System.out.println("tests_xmlExample.isXMLFile(): " + tests_xmlExample.isXMLFile());
		System.out.println("xmlExample-primeraClave: " + tests_xmlExample.getXML().getString("primeraClave") );
		mySessionBean.setMyProperty("primerValor");
	}
	
	public void printTrace(){
		System.out.println("Llegamos a printTrace()");
		System.out.println("mySessionBean: " + mySessionBean.getMyProperty());
	}
}
