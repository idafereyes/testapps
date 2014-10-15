package com.isb.tests.components.p;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.vectorsf.jvoiceframework.core.Input;
import com.vectorsf.jvoiceframework.core.bean.factory.JvoiceBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import com.vectorsf.jvoiceframework.core.Menu;

@Component("com_isb_tests_components_p_TestValidation")
@Scope("prototype")
public class TestValidation implements Serializable {

	private static final long serialVersionUID = 1L;
	@Autowired
	private JvoiceBeanService jvoiceBeanService;
	
	@Autowired
	private MySessionBean mySessionBean;
	
	public boolean validate_testProgValidation(String interpretation){	
		System.out.println("VALIDANDO [" + interpretation + "] COMO RESPUESTA CORRECTA");
		System.out.println("mySessionBean.myProperty: " + mySessionBean.getMyProperty());
		if (interpretation.equals(mySessionBean.getMyProperty())){
			System.out.println("VALIDACION OK");
			return true;
		} else {
			System.out.println("VALIDACION KO");
			return false;
		}
	}
	
	public boolean validate_testValidation(String interpretation){	
		System.out.println("VALIDANDO [" + interpretation + "] COMO RESPUESTA CORRECTA");
		System.out.println("mySessionBean.myProperty: " + mySessionBean.getMyProperty());
		if (interpretation.equals(mySessionBean.getMyProperty())){
			System.out.println("VALIDACION OK");
			mySessionBean.setMyProperty("2");
			System.out.println("Cambiamos valor de mySessionBean.myProperty a 2");
			return true;
		} else {
			System.out.println("VALIDACION KO");
			return false;
		}
	}
	
	public boolean validate_testMenuValidProg(String interpretation){	
		System.out.println("VALIDANDO [" + interpretation + "] COMO RESPUESTA CORRECTA");
		System.out.println("mySessionBean.myProperty: " + mySessionBean.getMyProperty());
		if (interpretation.equals(mySessionBean.getMyProperty())){
			System.out.println("VALIDACION OK");
			return true;
		} else {
			System.out.println("VALIDACION KO");
			return false;
		}
	}
	
	public boolean validate_testMenuValidation(String interpretation){	
		System.out.println("VALIDANDO [" + interpretation + "] COMO RESPUESTA CORRECTA");
		System.out.println("mySessionBean.myProperty: " + mySessionBean.getMyProperty());
		if (interpretation.equals(mySessionBean.getMyProperty())){
			System.out.println("VALIDACION OK");
			return true;
		} else {
			System.out.println("VALIDACION KO");
			return false;
		}
	}


	public Input testProgValidation() {
//		mySessionBean.setMyProperty("1");
//		System.out.println("Cambiamos valor de mySessionBean.myProperty a 1");
		Input input = jvoiceBeanService.getInput();
		input.getGrammars().add(jvoiceBeanService.getGrammar("dtmf", "builtin:dtmf/digits"));
		input.getMainAudios().add(jvoiceBeanService.getAudioItem(null, "Probando validación en estado programático"));
		input.setValidation(true);
		return input;
	}


	public Input noValidationProg() {
		Input input = jvoiceBeanService.getInput();
		input.getGrammars().add(jvoiceBeanService.getGrammar("dtmf", "builtin:dtmf/digits"));
		input.getMainAudios().add(jvoiceBeanService.getAudioItem(null, "Probando sin validación en estado programático"));
		return input;
	}

	public Menu testMenuValidProg() {
		Menu menu = jvoiceBeanService.getMenu();
		menu.getGrammars().add(jvoiceBeanService.getGrammar("dtmf", "builtin:dtmf/digits"));
		menu.getMainAudios().add(jvoiceBeanService.getAudioItem(null, "Probando validación en menú programático"));
		menu.addOptions("uno", "1");
		menu.addOptions("dos", "2");
		menu.setValidation(true);
		return menu;
	}

	public Menu noValidationMenuProg() {
		Menu menu = jvoiceBeanService.getMenu();
		menu.getGrammars().add(jvoiceBeanService.getGrammar("dtmf", "builtin:dtmf/digits"));
		menu.getMainAudios().add(jvoiceBeanService.getAudioItem(null, "Probando sin validación en menú programático"));
		menu.addOptions("uno", "1");
		menu.addOptions("dos", "2");
		return menu;
	}

}
