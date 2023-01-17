package com.agora12.test.seller.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.agora12.test.seller.sellmodel.SellModel;

@Repository
public interface SellerDAO {

	public int insertSellerDAO(
			@Param("nickname")String nickname
			, @Param("profillimage")String profillimage
			, @Param("temperature")double temperature
			);
	
	public SellModel selectSellerLast();
	
	public SellModel selectSeller(@Param("id")int id);
	
	
}