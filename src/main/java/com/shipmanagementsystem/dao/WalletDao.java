package com.shipmanagementsystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.shipmanagementsystem.mapper.WalletMapper;

import com.shipmanagementsystem.model.WalletModel;


/**
 * The Class WalletDao.
 */
@Repository
public class WalletDao {
		
	/** The get. */
	private String GET="select * from wallet;";
	
	/** The ship. */
	private String SHIP="update wallet set total_amount=? where id=1;";
	
	/** The book. */
	private String BOOK="update wallet set total_amount=? where id=1;";
	
	/** The jdbc template. */
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * Gets the wallet.
	 *
	 * @return the wallet
	 */
	public List<WalletModel> getWallet() {
		return jdbcTemplate.query(GET,new WalletMapper());
	}
	
	/**
	 * Buy ship.
	 *
	 * @param wallet the wallet
	 * @return true, if successful
	 */
	public boolean buyShip(WalletModel wallet) {
		if(jdbcTemplate.update(SHIP,wallet.getTotalAmount())!=0) {
			return true;
		}
		return false;
	}
	
	/**
	 * Booking.
	 *
	 * @param wallet the wallet
	 * @return true, if successful
	 */
	public boolean booking(WalletModel wallet) {
		if(jdbcTemplate.update(BOOK,wallet.getTotalAmount())!=0) {
			return true;
		}
		return false;
	}
}
