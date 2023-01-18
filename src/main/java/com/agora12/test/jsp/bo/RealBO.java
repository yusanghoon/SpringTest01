package com.agora12.test.jsp.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agora12.test.jsp.dao.RealDAO;
import com.agora12.test.jsp.realtormodel.RealtorUser;

@Service
public class RealBO {
	
	@Autowired
	private RealDAO realDAO;
	
	public int getRealBO(RealtorUser user) {
		
	    return realDAO.selectRealDAO(user);
	}
	
	
}
