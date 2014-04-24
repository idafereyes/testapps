package com.isb.modBugs.components.catchHangup;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.vectorsf.jvoiceframework.core.Menu;
import com.vectorsf.jvoiceframework.core.bean.factory.JvoiceBeanService;
import org.springframework.beans.factory.annotation.Autowired;

@Component
@Scope("prototype")
public class FlushFalseHangupFalse implements Serializable {

	private static final long serialVersionUID = 1L;
	// Add your methods here
	@Autowired
	private JvoiceBeanService jvoiceBeanService;
	public Menu prueeeba() {
		return jvoiceBeanService.getMenu();
	}
	public Menu state() {
		return jvoiceBeanService.getMenu();
	}
}
