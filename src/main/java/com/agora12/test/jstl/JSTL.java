package com.agora12.test.jstl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jstl")
public class JSTL {

	@GetMapping("/test01")
	public String test01() {
		
		return "/jsp/test01";
		
	}
	
}
