package com.isb.tests.components.p;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("com_isb_tests_components_p_SubflowProg")
@Scope("prototype")
public class SubflowProg implements Serializable {

	private static final long serialVersionUID = 1L;

	public String getFlowId(){
		System.out.println("******************getFlowId()");
		return "p/TermcharTest";
	}
}
