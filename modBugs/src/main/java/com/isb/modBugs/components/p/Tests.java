package com.isb.modBugs.components.p;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.vectorsf.jvoiceframework.core.Menu;
import com.vectorsf.jvoiceframework.core.bean.factory.JvoiceBeanService;
import org.springframework.beans.factory.annotation.Autowired;

@Component("com_isb_modBugs_components_p_Tests")
@Scope("prototype")
public class Tests implements Serializable {

	private static final long serialVersionUID = 1L;
	@Autowired
	private JvoiceBeanService jvoiceBeanService;
	public Menu menuProg() {
		return jvoiceBeanService.getMenu();
	}

	// Add your methods here
}
