package com.isb.miModulo.components;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebServiceController {

	
	@RequestMapping(value = "/fakeEndpoint", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public String fakeEndpoint() throws InterruptedException{
		System.out.println("Fake endpoint");
		Thread.sleep(10000);
		return "";		
	}
}
