package com.isb.modSayAs.components.p;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.vectorsf.jvoiceframework.core.Record;
import com.vectorsf.jvoiceframework.core.bean.factory.JvoiceBeanService;
import org.springframework.beans.factory.annotation.Autowired;

@Component
@Scope("prototype")
public class Main implements Serializable {

	private static final long serialVersionUID = 1L;
	@Autowired
	private JvoiceBeanService jvoiceBeanService;
	public Record state() {
		return jvoiceBeanService.getRecord();
	}

	// Add your methods here
}
