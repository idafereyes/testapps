package com.isb.modBugs.components.catchHangup;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FlushFalseHangupFalseTran implements Serializable {

	private static final long serialVersionUID = 1L;

	// Add your methods here
}
