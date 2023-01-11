package com.agora12.test.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test03Controller {

	@RequestMapping("/lfecycle/02")
	public String jspResponse() {
		return "lifecycle/test03";
	}
	
}
