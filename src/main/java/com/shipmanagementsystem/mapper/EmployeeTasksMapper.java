package com.shipmanagementsystem.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.shipmanagementsystem.model.EmployeeTasksModel;
;


/**
 * The Class EmployeeTasksMapper.
 */
public class EmployeeTasksMapper implements RowMapper<EmployeeTasksModel> {

	/**
	 * Map row.
	 *
	 * @param rs the rs
	 * @param rowNum the row num
	 * @return the employee tasks model
	 * @throws SQLException the SQL exception
	 */
	@Override
	public EmployeeTasksModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		EmployeeTasksModel task= new EmployeeTasksModel();
		task.setTaskId(rs.getInt("task_id"));
		task.setManagerId(rs.getString("manager_id"));
		task.setUserId(rs.getString("user_id"));
		task.setTask(rs.getString("task"));
		task.setFromDate(rs.getString("from_date"));
		task.setToDate(rs.getString("to_date"));
		task.setStatus(rs.getString("status"));
		return task;
	} 

}
