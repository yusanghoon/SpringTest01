package com.agora12.test.realestate.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.agora12.test.realestate.model.Model;

@Repository
public interface RealEstateDAO {

	public Model selectRealEstate(@Param("id") int id);
	
	public List<Model> selectRealEstateRent(@Param("rentPrice") int rentPrice);

	public List<Model> selectRealEstateArea(@Param("area") int area
			,@Param("price") int price);
	
	public int deleteRealEstate(@Param("id")int id);
		
	
}
	