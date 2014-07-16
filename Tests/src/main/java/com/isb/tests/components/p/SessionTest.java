package com.isb.tests.components.p;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vectorsf.jvoiceframework.core.bean.LastInputResult;

@Component("com_isb_tests_components_p_SessionTest")
@Scope("prototype")
public class SessionTest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	LastInputResult lastInputResult;

	public void print(){
		
		System.out.println("lastInputResult: " + lastInputResult.getVxmlEvent());
		System.out.println("lastInputResult.getFileName(): " + lastInputResult.getFileName());
	}

}
