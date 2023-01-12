package com.agora12.test.database.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.agora12.test.database.model.Store;

@Repository
public interface StoreDAO {
	
		//store 테이블 조회
		public List<Store> selectStoreList();

}
