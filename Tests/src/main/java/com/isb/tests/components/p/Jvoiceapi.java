package com.isb.tests.components.p;

import java.io.Serializable;
import java.util.Locale;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vectorsf.jvoiceframework.core.AudioItem;
import com.vectorsf.jvoiceframework.core.Grammar;
import com.vectorsf.jvoiceframework.core.Input;
import com.vectorsf.jvoiceframework.core.bean.factory.JvoiceBeanService;
import com.vectorsf.jvoiceframework.core.enums.InterpretAs;

import org.springframework.beans.factory.annotation.Autowired;
import com.vectorsf.jvoiceframework.core.Output;

@Component("com_isb_tests_components_p_Jvoiceapi")
@Scope("prototype")
public class Jvoiceapi implements Serializable {

	private static final long serialVersionUID = 1L;
	@Autowired
	private JvoiceBeanService jvoiceBeanService;
	public Input test() {
		
		Input input = jvoiceBeanService.getInput();
		
		AudioItem ai1 = jvoiceBeanService.getAudioItem("audioPrueba", "Primera prueba");
		AudioItem ai2 = jvoiceBeanService.getAudioItem(null, "Segunda prueba");
		AudioItem ai3 = jvoiceBeanService.getAudioItem("audioPrueba", null);
		AudioItem ai4 = jvoiceBeanService.getAudioItem("audioPruebaCondition", "Prueba condition", "attempts==0");
		AudioItem ai5 = jvoiceBeanService.getSayAsAudioItem("1234", InterpretAs.DIGITS, null);
		AudioItem ai6 = jvoiceBeanService.getSayAsAudioItem("121212", InterpretAs.DIGITS, "dmy");
		AudioItem ai7 = jvoiceBeanService.getSayAsAudioItem("1234", InterpretAs.DIGITS, null, "attempts==0");
		AudioItem ai8 = jvoiceBeanService.getAudioItemWithLocale("Prueba idioma", new Locale("en", "US"));
		AudioItem ai9 = jvoiceBeanService.getAudioItemWithUri("/AppPrueba/resources/audios/es_ES/audioPrueba.wav", "prueba uri");
		AudioItem ai10 = jvoiceBeanService.getAudioItemWithUri("/AppPrueba/resources/audios/es_ES/audioPrueba.wav", "prueba uri", "attempts==0");
		AudioItem ai11 = jvoiceBeanService.getAudioItemWithUri(null, "prueba uri");

		input.getMainAudios().add(ai1);
		input.getMainAudios().add(ai2);
		input.getMainAudios().add(ai3);
		input.getMainAudios().add(ai4);
		input.getMainAudios().add(ai5);
		input.getMainAudios().add(ai6);
		input.getMainAudios().add(ai7);
		input.getMainAudios().add(ai8);
		input.getMainAudios().add(ai9);
		input.getMainAudios().add(ai10);
		input.getMainAudios().add(ai11);

		
		Grammar gr1 = jvoiceBeanService.getGrammar("dtmf", "builtin:dtmf/digits");
		Grammar gr2 = jvoiceBeanService.getGrammar("voice", "Companies");
		Grammar gr3 = jvoiceBeanService.getGrammarWithUri("voice", "/AppPrueba/resources/grammars/es_ES/NombresSimilares.grxml");
		
		input.getGrammars().add(gr1);
		input.getGrammars().add(gr2);
		input.getGrammars().add(gr3);

		return input;
	}
	public Output testOutput() {
		Output output = jvoiceBeanService.getOutput();
		output.getAudioItems().add(jvoiceBeanService.getAudioItem(null, "TTS de prueba"));
		return output;
	}

}
