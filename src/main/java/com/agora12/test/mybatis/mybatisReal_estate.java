package com.agora12.test.mybatis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.agora12.test.mybatis.bo.MybatisReal_estateBO;

@Controller
public class mybatisReal_estate {

	private MybatisReal_estateBO mybatisReal_estateBO;
	
	@RequestMapping("/mybatis/test01")
	@ResponseBody
	public MybatisReal_estate getReal_estate() {
		MybatisReal_estate mybatisReal_estate = mybatisReal_estateBO.getMybatisReal_estate();
	}
	
}
