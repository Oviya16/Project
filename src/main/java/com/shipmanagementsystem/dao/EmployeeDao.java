package com.shipmanagementsystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.shipmanagementsystem.mapper.EmployeeMapper;

import com.shipmanagementsystem.model.EmployeeModel;


@Repository
public class EmployeeDao {

	private final String UPDATE="update employees set level=?,employee_salary=?,manager_id=? where user_id=?;";
	private final String ADD="insert into employees (user_id,employee_salary,manager_id,level) values (?,?,?,?);";
	private final String SELECT="select* from employees;";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<EmployeeModel> getAllEmployees(){
		return jdbcTemplate.query(SELECT, new EmployeeMapper());
	}
	
	public boolean addEmployee(EmployeeModel employee) {
		if (jdbcTemplate.update(ADD,employee.getUserId(),employee.getSalary(),employee.getManager(),employee.getLevel())!=0) {
			return true;
		}
		return false;
	}
	public boolean editEmployee(EmployeeModel employee) {
		if(jdbcTemplate.update(UPDATE, employee.getLevel(),employee.getSalary(),employee.getManager(),employee.getUserId())!=0) {
			return true;
		}
		return false;
	}
}
