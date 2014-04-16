package com.isb.modBugs.components.p;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.vectorsf.jvoiceframework.core.Output;
import com.vectorsf.jvoiceframework.core.bean.factory.JvoiceBeanService;
import org.springframework.beans.factory.annotation.Autowired;

@Component
@Scope("prototype")
public class Main implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private JvoiceBeanService jvoiceBeanService;
	
	public Output flushProg() {
		
		Output flushOut = jvoiceBeanService.getOutput();
		
		flushOut.setFlush(true);
		
		return flushOut;
	}

	// Add your methods here
}
