package com.isb.modSayAs.components.p;

import java.io.Serializable;
import java.util.Locale;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vectorsf.jvoiceframework.core.bean.factory.JvoiceBeanService;

import org.springframework.beans.factory.annotation.Autowired;

import com.vectorsf.jvoiceframework.core.AudioItem;
import com.vectorsf.jvoiceframework.core.Output;
import com.vectorsf.jvoiceframework.core.Wording;

@Component
@Scope("prototype")
public class Main implements Serializable {

	private static final long serialVersionUID = 1L;
	@Autowired
	private JvoiceBeanService jvoiceBeanService;

	public Output pruebaLang() {
		
		Output output = jvoiceBeanService.getOutput();
		
		AudioItem aiEsp = jvoiceBeanService.getAudioItem();
		Wording wdEsp = jvoiceBeanService.getWording();
		wdEsp.setText("Probando");		
		aiEsp.setWording(wdEsp);

		AudioItem aiEn = jvoiceBeanService.getAudioItem();
		Wording wdEn = jvoiceBeanService.getWording();
		wdEn.setText("Languages");	
		wdEn.setLocale(new Locale("en", "US"));
		aiEn.setWording(wdEn);
		
		output.getAudioItems().add(aiEsp);
		output.getAudioItems().add(aiEn);
		
		return output;
	}

	public Output pruebaLangSep() {
		
		Output output = jvoiceBeanService.getOutput();
		AudioItem aiEn = jvoiceBeanService.getAudioItem();
		Wording wdEn = jvoiceBeanService.getWording();
		wdEn.setText("Languages");	
		wdEn.setLocale(new Locale("en", "US"));
		aiEn.setWording(wdEn);

		output.getAudioItems().add(aiEn);

		return output;
	}
}
