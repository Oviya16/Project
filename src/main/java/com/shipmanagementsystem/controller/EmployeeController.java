package com.shipmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shipmanagementsystem.model.EmployeeModel;
import com.shipmanagementsystem.service.EmployeeService;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee")
	public ResponseEntity<Object> getAllEmployees() {
		return ResponseEntity.ok(employeeService.getAllEmloyees());
	}

	

	@PutMapping("/employee")
	public ResponseEntity<Object> editEmployee(@RequestBody EmployeeModel model){
		boolean status = this.employeeService.editEmployee(model);
		if (status) {
			return new ResponseEntity<Object>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
	@PostMapping("/employee")
	public ResponseEntity<Object> addEmployee(@RequestBody EmployeeModel model) {
		try {
			System.out.println(model.getUserId() + model.getLevel() + model.getManager() + model.getSalary());
			boolean status = employeeService.addEmployee(model);
			if (!status) {
				throw new Exception();
			}
			return new ResponseEntity<Object>(model, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
}
