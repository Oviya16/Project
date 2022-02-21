package com.shipmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shipmanagementsystem.dao.EmployeeDao;
import com.shipmanagementsystem.model.EmployeeModel;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	public boolean editEmployee(EmployeeModel employee) {
		return this.employeeDao.editEmployee(employee);
	}
	public boolean addEmployee(EmployeeModel employee) {
		return this.employeeDao.addEmployee(employee);
	}
	public List<EmployeeModel> getAllEmloyees() {
		return employeeDao.getAllEmployees();
	}

}
