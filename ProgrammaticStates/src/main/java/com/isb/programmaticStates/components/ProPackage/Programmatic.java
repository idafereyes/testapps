package com.isb.programmaticStates.components.ProPackage;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.vectorsf.jvoiceframework.core.Menu;
import com.vectorsf.jvoiceframework.core.bean.factory.JvoiceBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import com.vectorsf.jvoiceframework.core.Option;
import com.vectorsf.jvoiceframework.core.Transfer;
import com.vectorsf.jvoiceframework.core.Input;

@Component
@Scope("prototype")
public class Programmatic implements Serializable {

	private static final long serialVersionUID = 1L;
	@Autowired
	private JvoiceBeanService jvoiceBeanService;
	public Menu state() {
		return jvoiceBeanService.getMenu();
	}
	private enum OPT_state implements Option {
		
		NUEVO("nuevo");
	
		private String option = null;
	
		private OPT_state(String option) {
			this.option = option;
		}
		@Override
		public String getOption() {
			return option;
		}
	}
	public Transfer transfiereme() {
		return jvoiceBeanService.getBlindTransfer();
	}
	public Input stateddd() {
		return jvoiceBeanService.getInput();
	}

	// Add your methods here
}
