package com.shipmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shipmanagementsystem.model.WalletModel;
import com.shipmanagementsystem.service.WalletService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class WalletController {
	
	@Autowired
	private WalletService walletService;
	
	@GetMapping("/wallet")
	public ResponseEntity<Object> getWallet(){
		return ResponseEntity.ok(walletService.getWallet());
}
	@PutMapping("/walletShip")
	public ResponseEntity<Object> buyShip(@RequestBody WalletModel model){
		boolean status = this.walletService.buyShip(model);
		if (status) {
			return new ResponseEntity<Object>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
	@PutMapping("/walletBooking")
	public ResponseEntity<Object> booking(@RequestBody WalletModel model){
		boolean status = this.walletService.buyShip(model);
		if (status) {
			return new ResponseEntity<Object>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
}
