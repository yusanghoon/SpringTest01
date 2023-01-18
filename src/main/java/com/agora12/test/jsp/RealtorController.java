package com.agora12.test.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.agora12.test.jsp.bo.RealBO;
import com.agora12.test.jsp.realtormodel.RealtorUser;

@Controller
public class RealtorController {

	@Autowired
	private RealBO realBO;
	
	@GetMapping("/jsp/realtor/add")
	public String addUser(
//			@RequestParam("office") String office
//			, @RequestParam("phoneNumber") String phoneNumber
//			, @RequestParam("address") String address
//			, @RequestParam("grade") String grade
			@ModelAttribute RealtorUser user
			, Model model) {
		
//		String addUser = realBO.getRealBO(office,phoneNumber,address,grade);
		
		
//		RealtorUser user = new RealtorUser();
//		user.setOffice(office);
//		user.setPhoneNumber(phoneNumber);
//		user.setAddress(address);
//		user.setGrade(grade);
		
		realBO.getRealBO(user);
		
		model.addAttribute("user",user);
		
		
		return "realtor/realtor";
		
		
	}
	@GetMapping("/jsp/realtor/input")
	public String userInput() {
		return "realtor/realtorinput";	
		
	}
	
	
}
