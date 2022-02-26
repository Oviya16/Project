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

import com.shipmanagementsystem.exceptions.ResourceNotFoundException;
import com.shipmanagementsystem.model.EmployeeModel;
import com.shipmanagementsystem.service.EmployeeService;



/**
 * The Class EmployeeController.
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class EmployeeController {
	
	/** The employee service. */
	@Autowired
	private EmployeeService employeeService;
	
	/**
	 * Gets the all employees.
	 *
	 * @return the all employees
	 */
	@GetMapping("/employee")
	public ResponseEntity<Object> getAllEmployees() {
		return ResponseEntity.ok(employeeService.getAllEmloyees());
	}

	

	/**
	 * Edits the employee.
	 *
	 * @param model the model
	 * @return the response entity
	 */
	@PutMapping("/employee")
	public ResponseEntity<Object> editEmployee(@RequestBody EmployeeModel model){
		boolean status = this.employeeService.editEmployee(model);
		if (status) {
			return new ResponseEntity<Object>(HttpStatus.OK);
		} else {
			throw new ResourceNotFoundException("Failed to edit Employee");
		}
	}
	
	/**
	 * Adds the employee.
	 *
	 * @param model the model
	 * @return the response entity
	 */
	@PostMapping("/employee")
	public ResponseEntity<Object> addEmployee(@RequestBody EmployeeModel model) {
		
			boolean status = employeeService.addEmployee(model);
			if (status) {
				return new ResponseEntity<Object>(model, HttpStatus.CREATED);
			}
			
		throw new ResourceNotFoundException("Failed to delete Booking");
		
	}
}
