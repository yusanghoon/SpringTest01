package com.agora12.test.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

	@Controller
	public class TestController {
	    @ResponseBody
	    @RequestMapping("/hello")
	    public String helloWorld() {
	        return "Hello World!!";
	    }
	}

