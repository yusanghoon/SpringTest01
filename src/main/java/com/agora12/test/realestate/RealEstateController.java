package com.agora12.test.realestate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.agora12.test.realestate.bo.RealEstateBO;
import com.agora12.test.realestate.model.Model;

@Controller
@RequestMapping("/RealEstateBO")
public class RealEstateController {

	@Autowired
	private RealEstateBO realEstateBO;
	
	@ResponseBody
	@RequestMapping("1")
	public Model getRealEstate(@RequestParam("id") int id) {
		Model getReal = realEstateBO.getRealEstate(id);
		return getReal;
				
	}
	@ResponseBody
	@RequestMapping("2")
	public List<Model> getRealEstateRent(@RequestParam("rentPrice") int rentPrice){
		List<Model> RealEstateRent = realEstateBO.getRealEstateRent(rentPrice);
		return RealEstateRent;
	}
	
	@ResponseBody
	@RequestMapping("3")
	public List<Model> getRealEstateArea(
			@RequestParam("area") int area
			,@RequestParam("price") int price
			){
		List<Model> RealEstate = realEstateBO.getRealEstateArea(area,price);
		return RealEstate;
	}
	
	@ResponseBody
	@RequestMapping("4")
	public String deleteREalEstate(@RequestParam("id")int id) {
		int count = realEstateBO.deleteRealEstate(id);
		return "삭제 : " + count;
		
	}
	
	
	
	
	
	
	
	
}
