package com.agora12.test.seller.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agora12.test.seller.dao.SellerDAO;
import com.agora12.test.seller.sellmodel.SellModel;


@Service
public class SellerBO {

	@Autowired
	private SellerDAO sellerDAO; 
	
	public int getSeller(String nickname,String profillimage,double string) {
		return sellerDAO.insertSellerDAO(nickname, profillimage, string);
		 
	}
	
	public SellModel getSeller(Integer id) {
		if( id == null) {
			return sellerDAO.selectSellerLast();
		}else {
			return sellerDAO.selectSeller(id);
		}
	}
	

	public SellModel getSellerLast() {
		SellModel sellerLast = sellerDAO.selectSellerLast();
		return sellerLast;
	}
	
	public SellModel getSeller(int id) {
		return sellerDAO.selectSeller(id);
	}
	
	
}
