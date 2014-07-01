package com.isb.tests.components.p;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vectorsf.jvoiceframework.core.AudioItem;
import com.vectorsf.jvoiceframework.core.Record;
import com.vectorsf.jvoiceframework.core.Wording;
import com.vectorsf.jvoiceframework.core.bean.factory.JvoiceBeanService;

import org.springframework.beans.factory.annotation.Autowired;

@Component("com_isb_tests_components_p_NoInputRecord")
@Scope("prototype")
public class NoInputRecord implements Serializable {

	private static final long serialVersionUID = 1L;
	@Autowired
	private JvoiceBeanService jvoiceBeanService;
	public Record testNIRecordProg() {
		
		Record rec = jvoiceBeanService.getRecord();
		
		rec.setMaxNoInput(2);
		
		AudioItem ai = jvoiceBeanService.getAudioItem();		
		Wording wd = jvoiceBeanService.getWording();		
		wd.setText("Probando no input en record programatico");
		ai.setWording(wd);
		
		rec.getAudioItems().add(ai);

		AudioItem aiNI = jvoiceBeanService.getAudioItem();		
		Wording wdNI = jvoiceBeanService.getWording();		
		wdNI.setText("No ha dicho nada");
		aiNI.setWording(wdNI);
		
		rec.getNoInputAudios().add(aiNI);
		
		rec.setTimeout("10s");
		
		return rec;
	}

	// Add your methods here
}
