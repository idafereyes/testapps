package com.isb.modBugs.components.p;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FlushSinConfig implements Serializable {

	private static final long serialVersionUID = 1L;

	// Add your methods here
}
