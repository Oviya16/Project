package com.shipmanagementsystem.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shipmanagementsystem.exceptions.ResourceNotFoundException;
import com.shipmanagementsystem.model.RegisterModel;

import com.shipmanagementsystem.service.RegisterService;


/**
 * The Class RegisterController.
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class RegisterController {

	/** The register service. */
	@Autowired
	private RegisterService registerService;

	/**
	 * Login.
	 *
	 * @param model the model
	 * @return the response entity
	 * */
	@PostMapping("/login")
	public ResponseEntity<Object> login(@RequestBody RegisterModel model) {
		String loginStatus = this.registerService.checkLogin(model);
		if (loginStatus.equals("Password") || loginStatus.equals("UserId") || loginStatus.equals("Rejected") || loginStatus.equals("Pending")) {
			Map<String, String> message = new HashMap<String, String>();
			message.put("category", loginStatus);
			return new ResponseEntity<Object>(message,HttpStatus.BAD_REQUEST);
		} else {
			String role = loginStatus.substring(9, loginStatus.length());
			Map<String, String> message = new HashMap<String, String>();
			message.put("category", role);
			return new ResponseEntity<Object>(message, HttpStatus.OK);
		}
	}

	/**
	 * Gets the all users.
	 *
	 * @return the all users
	 */
	@GetMapping("/User")
	public ResponseEntity<Object> getAllUsers() {
		return ResponseEntity.ok(registerService.getAllUsers());
	}

	/**
	 * Post student.
	 *
	 * @param model the model
	 * @return the response entity
	 */
	@PostMapping("/User")
	public ResponseEntity<Object> postStudent(@RequestBody RegisterModel model) {

			boolean status = registerService.postUser(model);
			if (status) {
				return new ResponseEntity<Object>(model, HttpStatus.CREATED);
			}
			
		 throw new ResourceNotFoundException("Failed to add user");
			
	}
	
	/**
	 * Gets the pending users.
	 *
	 * @return the pending users
	 */
	@GetMapping("/Temp")
	public ResponseEntity<Object> getPendingUsers(){
		return ResponseEntity.ok(registerService.getPendingUsers());
	}
	
	/**
	 * Approve users.
	 *
	 * @param model the model
	 * @return the response entity
	 */
	@PutMapping("/Approve")
	public ResponseEntity<Object> approveUsers(@RequestBody RegisterModel model){
		boolean status = this.registerService.approveUsers(model);
		if (status) {
			return new ResponseEntity<Object>(HttpStatus.OK);
		} else {
			throw new ResourceNotFoundException("Failed to approve user");
		}
	}
	
	/**
	 * Reject users.
	 *
	 * @param model the model
	 * @return the response entity
	 */
	@PostMapping("/Reject")
	public ResponseEntity<Object> rejectUsers(@RequestBody RegisterModel model){
			boolean status = registerService.rejectUsers(model);
			if (status) {
				return new ResponseEntity<Object>(model, HttpStatus.CREATED);
			}
			
		 throw new ResourceNotFoundException("Failed to add user");
	
	}
}
