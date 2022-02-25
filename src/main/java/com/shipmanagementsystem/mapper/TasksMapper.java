package com.shipmanagementsystem.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.shipmanagementsystem.model.TasksModel;

public class TasksMapper implements RowMapper<TasksModel> {

	@Override
	public TasksModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		TasksModel task= new TasksModel();
		task.setTaskId(rs.getInt("task_id"));
		task.setUserId(rs.getString("user_id"));
		task.setTask(rs.getString("task"));
		task.setFromDate(rs.getString("from_date"));
		task.setToDate(rs.getString("to_date"));
		task.setStatus(rs.getString("status"));
		return task;
	}

}
