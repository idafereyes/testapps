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
		output.getAudioItems().add(jvoiceBeanService.getAudioItem("audio", "Text in english"));
		output.getAudioItems().add(jvoiceBeanService.getAudioItem("audio", null));
		output.getAudioItems().add(jvoiceBeanService.getAudioItem(null, "Text in english"));
		output.getAudioItems().add(jvoiceBeanService.getAudioItemWithLocale("Texto en español", new Locale("es", "ES")));
		output.getAudioItems().add(jvoiceBeanService.getAudioItemWithLocale("audio", "Texto en español", new Locale("es", "ES")));
		output.getAudioItems().add(jvoiceBeanService.getAudioItemWithLocale("audio", null, new Locale("es", "ES")));
		output.getAudioItems().add(jvoiceBeanService.getAudioItemWithLocale(null, "Texto en español", new Locale("es", "ES")));
		output.getAudioItems().add(jvoiceBeanService.getAudioItemWithLocale(null, "Texto en español", null));
		output.getAudioItems().add(jvoiceBeanService.getAudioItem(null, "Text in english"));
		return output;
	}

}
