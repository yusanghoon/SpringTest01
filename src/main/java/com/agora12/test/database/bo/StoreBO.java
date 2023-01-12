package com.agora12.test.database.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agora12.test.database.dao.StoreDAO;
import com.agora12.test.database.model.Store;

@Service
public class StoreBO {

	//store 테이블의 데이터를 조회하고 리턴하는 메소드
	@Autowired
	private StoreDAO storeDAO;
	
	public List<Store> getStoreList(){
		
		List<Store> StoreList = storeDAO.selectStoreList();
		
		return StoreList;
	}
	
	
}
