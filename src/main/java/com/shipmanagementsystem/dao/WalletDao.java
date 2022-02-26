package com.shipmanagementsystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.shipmanagementsystem.mapper.WalletMapper;

import com.shipmanagementsystem.model.WalletModel;

@Repository
public class WalletDao {
		
	private String GET="select * from wallet;";
	private String SHIP="update wallet set total_amount=? where id=1;";
	private String BOOK="update wallet set total_amount=? where id=1;";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<WalletModel> getWallet() {
		return jdbcTemplate.query(GET,new WalletMapper());
	}
	public boolean buyShip(WalletModel wallet) {
		if(jdbcTemplate.update(SHIP,wallet.getTotalAmount())!=0) {
			return true;
		}
		return false;
	}
	public boolean booking(WalletModel wallet) {
		if(jdbcTemplate.update(BOOK,wallet.getTotalAmount())!=0) {
			return true;
		}
		return false;
	}
}
