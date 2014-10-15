package com.isb.tests.components.p;

import java.io.Serializable;
import java.util.Locale;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vectorsf.jvoiceframework.core.Input;
import com.vectorsf.jvoiceframework.core.bean.factory.JvoiceBeanService;

import org.springframework.beans.factory.annotation.Autowired;

@Component("com_isb_tests_components_p_LocaleGrammars")
@Scope("prototype")
public class LocaleGrammars implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private JvoiceBeanService jvoiceBeanService;
	
	public Input differentLocale() {
		Input input = jvoiceBeanService.getInput();
		input.getGrammars().add(jvoiceBeanService.getGrammar("voice", "builtin:grammar/digits"));
		input.getGrammars().add(jvoiceBeanService.getGrammar("voice", "Companies"));
		input.getGrammars().add(jvoiceBeanService.getGrammar("voice", "Companies", new Locale("es", "ES")));
		input.getGrammars().add(jvoiceBeanService.getGrammar("voice", "builtin:grammar/digits", new Locale("es", "ES")));
		input.getMainAudios().add(jvoiceBeanService.getAudioItem(null, "TTS text"));
		return input;
	}

}
