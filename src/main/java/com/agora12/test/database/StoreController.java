package com.agora12.test.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.agora12.test.database.bo.StoreBO;
import com.agora12.test.database.model.Store;


@Controller
public class StoreController {

	@Autowired
	private StoreBO storeBO;
	
	@ResponseBody
	@RequestMapping("/database/test02")
	public List<Store> getStoreList(){
		
		List<Store> storeList = storeBO.getStoreList();
		
		return storeList;
	}
	
}
