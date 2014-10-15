package com.isb.tests.components.p;

import java.io.IOException;
import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("com_isb_tests_components_p_TestExecute")
@Scope("prototype")
public class TestExecute implements Serializable {

	private static final long serialVersionUID = 1L;


	public void testingExceptions() throws Exception{
		
	}
	
	public void testOtherException() throws IOException {
		System.out.println("probando probando");
	}

	public void testParameters(String param1){
		
	}
}

