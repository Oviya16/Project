package com.shipmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shipmanagementsystem.dao.WalletDao;
import com.shipmanagementsystem.model.WalletModel;

@Service
public class WalletService {

	@Autowired
	private WalletDao walletDao;
	
	public boolean buyShip(WalletModel wallet) {
		return this.walletDao.buyShip(wallet);
	}
	public boolean booking(WalletModel wallet) {
		return this.walletDao.booking(wallet);
	}
	public List<WalletModel> getWallet(){
		return this.walletDao.getWallet();
	}
}
