package com.shipmanagementsystem.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shipmanagementsystem.dao.WalletDao;
import com.shipmanagementsystem.model.WalletModel;

/**
 * The Class WalletService.
 */
@Service
public class WalletService {

	/** The wallet dao. */
	@Autowired
	private WalletDao walletDao;
	
	/**
	 * Buy ship.
	 *
	 * @param wallet the wallet
	 * @return true, if successful
	 */
	public boolean buyShip(WalletModel wallet) {
		return this.walletDao.buyShip(wallet);
	}
	
	/**
	 * Booking.
	 *
	 * @param wallet the wallet
	 * @return true, if successful
	 */
	public boolean booking(WalletModel wallet) {
		return this.walletDao.booking(wallet);
	}
	
	/**
	 * Gets the wallet.
	 *
	 * @return the wallet
	 */
	public List<WalletModel> getWallet(){
		return this.walletDao.getWallet();
	}
}
