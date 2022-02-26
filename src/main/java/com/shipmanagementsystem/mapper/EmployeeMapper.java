package com.shipmanagementsystem.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.shipmanagementsystem.model.EmployeeModel;


/**
 * The Class EmployeeMapper.
 */
public class EmployeeMapper implements RowMapper<EmployeeModel> {

	/**
	 * Map row.
	 *
	 * @param rs the rs
	 * @param i the i
	 * @return the employee model
	 * @throws SQLException the SQL exception
	 */
	@Override
	public EmployeeModel mapRow(ResultSet rs, int i) throws SQLException {
		// TODO Auto-generated method stub
		EmployeeModel employee= new EmployeeModel();
		employee.setUserId(rs.getString("user_id"));
		employee.setLevel(rs.getString("level"));
		employee.setSalary(rs.getString("employee_salary"));
		employee.setManager(rs.getString("manager_id"));
		return employee;
	}

}
