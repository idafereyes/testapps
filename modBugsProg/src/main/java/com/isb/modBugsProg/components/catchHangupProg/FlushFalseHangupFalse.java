package com.isb.modBugsProg.components.catchHangupProg;

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
public class FlushFalseHangupFalse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private JvoiceBeanService jvoiceBeanService;
	
	public Output test() {
		
		Output output = jvoiceBeanService.getOutput();
		
		AudioItem ai = jvoiceBeanService.getAudioItem();		
		Wording wd = jvoiceBeanService.getWording();		
		wd.setText("Probamos un output programático con flush y catchHangup a false");		
		ai.setWording(wd);
		
		output.getAudioItems().add(ai);		
		output.setCatchHangup(false);
		output.setFlush(false);
		
		return output;
	}

}
