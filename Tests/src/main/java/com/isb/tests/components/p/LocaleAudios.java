package com.isb.tests.components.p;

import java.io.Serializable;
import java.util.Locale;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vectorsf.jvoiceframework.core.Output;
import com.vectorsf.jvoiceframework.core.bean.factory.JvoiceBeanService;

import org.springframework.beans.factory.annotation.Autowired;

@Component("com_isb_tests_components_p_LocaleAudios")
@Scope("prototype")
public class LocaleAudios implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private JvoiceBeanService jvoiceBeanService;
	
	public Output testLocale() {
		Output output = jvoiceBeanService.getOutput();
		output.getAudioItems().add(jvoiceBeanService.getAudioItem("TTS text", new Locale("es", "ES")));
		return output;
	}

	// Add your methods here
}
