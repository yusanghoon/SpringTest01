package com.agora12.test.jsp.dao;

import org.springframework.stereotype.Repository;

import com.agora12.test.jsp.realtormodel.RealtorUser;


@Repository
public interface RealDAO {

	
	public int selectRealDAO(RealtorUser user);
	
}
