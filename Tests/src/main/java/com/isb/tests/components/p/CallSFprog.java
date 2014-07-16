package com.isb.tests.components.p;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("com_isb_tests_components_p_CallSFprog")
@Scope("prototype")
public class CallSFprog implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	* @return id from the flow to be executed.
	*/
	public String callToSfProg() {
		return "p/calledSFProg";
	}

	// Add your methods here
}
