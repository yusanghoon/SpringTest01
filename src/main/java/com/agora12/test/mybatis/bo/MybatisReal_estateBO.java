package com.agora12.test.mybatis.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agora12.test.mybatis.dao.MybatisReal_estateDAO;

@Service
public class MybatisReal_estateBO {

	@Autowired
	private MybatisReal_estateDAO mybatisReal_estateDAO;
	
	public MybatisReal_estateDAO getgetMybatisReal_estate() {
		
		MybatisReal_estateDAO mybatisReal_estate = mybatisReal_estateDAO.selectMybatisReal_estate();
		
		return mybatisReal_estate;
		
	}
}
