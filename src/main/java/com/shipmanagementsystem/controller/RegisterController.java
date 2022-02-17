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

import com.shipmanagementsystem.model.RegisterModel;
import com.shipmanagementsystem.service.RegisterService;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
public class RegisterController {

	@Autowired
	private RegisterService registerService;

	@PutMapping("/login")
	public ResponseEntity<Object> login(@RequestBody RegisterModel model) {
		String check = this.registerService.checkLogin(model);
		if (check.equals("yes")) {
			return new ResponseEntity<Object>(HttpStatus.OK);
		} else if(check.equals("password")) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
			else {
				return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/User")
	public ResponseEntity<Object> getAllCourses() {
		return ResponseEntity.ok(registerService.getAllUser());
	}

	@PostMapping("/User")
	public ResponseEntity<Object> postStudent(@RequestBody RegisterModel model) {
		try {
			boolean status = registerService.postUser(model);
			if (!status) {
				throw new Exception();
			}
			return new ResponseEntity<Object>(model, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
}