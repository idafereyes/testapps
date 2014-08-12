package com.isb.modPropsTest.components.p;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vectorsf.jvoiceframework.core.admin.AppConfig;

@Component("com_isb_modPropsTest_components_p_Main")
@Scope("prototype")
public class Main implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private AppConfig appProp;

	@Autowired
	private AppConfig modPropsTest_example;

	@Autowired
	private AppConfig otherMod_otherProp;


	public void testProperties(){
		
		System.out.println("Properties de la app: " + appProp.getValue("appKey"));
		System.out.println("Properties de este módulo: " + modPropsTest_example.getValue("modKey"));
		System.out.println("Properties de otro módulo que está en la app: " + otherMod_otherProp.getValue("otherKey"));
	
	}
}
