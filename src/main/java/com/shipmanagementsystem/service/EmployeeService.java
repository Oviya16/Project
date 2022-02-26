package com.shipmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shipmanagementsystem.dao.EmployeeDao;
import com.shipmanagementsystem.model.EmployeeModel;


/**
 * The Class EmployeeService.
 */
@Service
public class EmployeeService {
	
	/** The employee dao. */
	@Autowired
	private EmployeeDao employeeDao;

	/**
	 * Edits the employee.
	 *
	 * @param employee the employee
	 * @return true, if successful
	 */
	public boolean editEmployee(EmployeeModel employee) {
		return this.employeeDao.editEmployee(employee);
	}
	
	/**
	 * Adds the employee.
	 *
	 * @param employee the employee
	 * @return true, if successful
	 */
	public boolean addEmployee(EmployeeModel employee) {
		return this.employeeDao.addEmployee(employee);
	}
	
	/**
	 * Gets the all emloyees.
	 *
	 * @return the all emloyees
	 */
	public List<EmployeeModel> getAllEmloyees() {
		return employeeDao.getAllEmployees();
	}

}
