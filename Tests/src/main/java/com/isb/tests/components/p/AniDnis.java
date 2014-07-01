package com.isb.tests.components.p;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("com_isb_tests_components_p_AniDnis")
@Scope("prototype")
public class AniDnis implements Serializable {

	private static final long serialVersionUID = 1L;

	// Add your methods here
}
