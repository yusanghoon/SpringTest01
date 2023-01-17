package com.agora12.test.seller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.agora12.test.seller.bo.SellerBO;
import com.agora12.test.seller.sellmodel.SellModel;

@Controller
@RequestMapping("/lesson04/test01")
public class SellerController {
	
	@Autowired
	private  SellerBO sellerBO;

	
	@ResponseBody
	@PostMapping("/1")
	public String getSeller(
			@RequestParam("nickname")String nickname
			, @RequestParam("profillimage") String profillimage
			, @RequestParam("temperature") double temperature
			) {
		
		int count = sellerBO.getSeller(nickname,profillimage,temperature);
		
		return "추가 : " + count;
		
	}
	
	@GetMapping("/2")
	public String SellerInput() {
		return "seller/seller";
	}
	
	@GetMapping("/3")
	public String sellerInfo(
					@RequestParam(value="id", required=false) Integer id
					,Model model) {
		
//		SellModel seller = null;
//		
//		if(id==null) {
//			seller = sellerBO.getSellerLast();				
//		}else {
//			seller = sellerBO.getSeller(id);
//		}
		SellModel seller = sellerBO.getSeller(id);
		model.addAttribute("seller",seller);
		
		return "seller/sellerInfo";	
		
	}
	
	
	@GetMapping("/4")
	public String sellerInfoById(@RequestParam("id")int id, Model model) {
		
		SellModel seller = sellerBO.getSeller(id);
		model.addAttribute("seller",seller);
		
		return "seller/sellerInfo";
	}
	
	
	
}
