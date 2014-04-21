package com.isb.modBugs.components.p;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vectorsf.jvoiceframework.core.AudioItem;
import com.vectorsf.jvoiceframework.core.Output;
import com.vectorsf.jvoiceframework.core.Wording;
import com.vectorsf.jvoiceframework.core.bean.factory.JvoiceBeanService;

import org.springframework.beans.factory.annotation.Autowired;

@Component
@Scope("prototype")
public class FlushProgTrue implements Serializable {

	private static final long serialVersionUID = 1L;
	@Autowired
	private JvoiceBeanService jvoiceBeanService;
	
	public Output testFlush() {
		Output flushOut = jvoiceBeanService.getOutput();
		
		flushOut.setFlush(true);
		
		AudioItem ai = jvoiceBeanService.getAudioItem();
		
		Wording wd = jvoiceBeanService.getWording();
		
		wd.setText("Probando estado programático con flush a true.");
		
		ai.setWording(wd);
		flushOut.getAudioItems().add(ai);
		
		return flushOut;
	}

}
