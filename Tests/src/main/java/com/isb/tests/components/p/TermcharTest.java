package com.isb.tests.components.p;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vectorsf.jvoiceframework.core.AudioItem;
import com.vectorsf.jvoiceframework.core.Grammar;
import com.vectorsf.jvoiceframework.core.Input;
import com.vectorsf.jvoiceframework.core.Wording;
import com.vectorsf.jvoiceframework.core.bean.LastInputResult;
import com.vectorsf.jvoiceframework.core.bean.factory.JvoiceBeanService;

@Component("com_isb_tests_components_p_TermcharTest")
@Scope("prototype")
public class TermcharTest implements Serializable {

	private static final long serialVersionUID = 1L;
	@Autowired
	private JvoiceBeanService jvoiceBeanService;
	
	@Autowired
	private LastInputResult lastInputResult;
	
//	public Menu termcharMenuProg() {
//		
//		Menu menu = jvoiceBeanService.getMenu();
//		
//		Grammar gr = jvoiceBeanService.getGrammar();		
//		gr.setMode("dtmf");
//		gr.setSrc("builtin:dtmf/digits");		
//		menu.getGrammars().add(gr);
//		
//		AudioItem ai = jvoiceBeanService.getAudioItem();		
//		Wording wd = jvoiceBeanService.getWording();		
//		wd.setText("Probando termchar con menu programático.");
//		ai.setWording(wd);
//		menu.getMainAudios().add(ai);
//		
//		menu.addOptions("uno", "1");
//		
//		return menu;
//	}
	
	public Input termcharInputProg() {
		
		Input input = jvoiceBeanService.getInput();
		
		input.setTermchar("0");
		
		Grammar gr = jvoiceBeanService.getGrammar();		
		gr.setMode("dtmf");
		gr.setSrc("builtin:dtmf/digits");		
		input.getGrammars().add(gr);
		
		AudioItem ai = jvoiceBeanService.getAudioItem();		
		Wording wd = jvoiceBeanService.getWording();		
		wd.setText("Probando termchar con input programático.");
		ai.setWording(wd);
		
		input.getMainAudios().add(ai);
		
		return input;
	}

	public void printLasResult(){
		
		System.out.println("INTERPRETATION: " + lastInputResult.getInterpretation());
		System.out.println("UTTERANCE: " + lastInputResult.getUtterance());
		
	}
}
