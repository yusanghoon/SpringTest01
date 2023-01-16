package com.agora12.test.realestate.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agora12.test.realestate.dao.RealEstateDAO;
import com.agora12.test.realestate.model.Model;



@Service
public class RealEstateBO {

	@Autowired
	private RealEstateDAO realEstateDAO;
	
	public Model getRealEstate(int id){
		
		Model realEstate = realEstateDAO.selectRealEstate(id);
		
		return  realEstate;
	}
	
	
	public List<Model> getRealEstateRent(int rentPrice){
		
		List<Model> RealEstateRent = realEstateDAO.selectRealEstateRent(rentPrice);
		
		return RealEstateRent;
	}
	
	public List<Model> getRealEstateArea(int area, int price){
		List<Model> RealEstateArea = realEstateDAO.selectRealEstateArea(area, price);
		return RealEstateArea;
	}
	
	public int deleteRealEstate(int id) {
	    return realEstateDAO.deleteRealEstate(id);
	}
	
	
	
	
	
}
