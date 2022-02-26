package com.shipmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shipmanagementsystem.exceptions.ResourceNotFoundException;
import com.shipmanagementsystem.model.WalletModel;
import com.shipmanagementsystem.service.WalletService;


/**
 * The Class WalletController.
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class WalletController {
	
	/** The wallet service. */
	@Autowired
	private WalletService walletService;
	
	/**
	 * Gets the wallet.
	 *
	 * @return the wallet
	 */
	@GetMapping("/wallet")
	public ResponseEntity<Object> getWallet(){
		return ResponseEntity.ok(walletService.getWallet());
}
	
	/**
	 * Buy ship.
	 *
	 * @param model the model
	 * @return the response entity
	 */
	@PutMapping("/walletShip")
	public ResponseEntity<Object> buyShip(@RequestBody WalletModel model){
		boolean status = this.walletService.buyShip(model);
		if (status) {
			return new ResponseEntity<Object>(HttpStatus.OK);
		} else {
			 throw new ResourceNotFoundException("Failed to update wallet");
		}
	}
	
	/**
	 * Booking.
	 *
	 * @param model the model
	 * @return the response entity
	 */
	@PutMapping("/walletBooking")
	public ResponseEntity<Object> booking(@RequestBody WalletModel model){
		boolean status = this.walletService.buyShip(model);
		if (status) {
			return new ResponseEntity<Object>(HttpStatus.OK);
		} else {
			 throw new ResourceNotFoundException("Failed to update wallet");
		}
	}
}
