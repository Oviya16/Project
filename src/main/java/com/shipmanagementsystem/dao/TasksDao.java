package com.shipmanagementsystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.shipmanagementsystem.mapper.EmployeeTasksMapper;
import com.shipmanagementsystem.mapper.TasksMapper;

import com.shipmanagementsystem.model.EmployeeTasksModel;
import com.shipmanagementsystem.model.TasksModel;

@Repository
public class TasksDao {
	private final String GET="select * from tasks where user_id=?;";
	private final String UPDATE="update tasks set status=? where task_id=?";
	private final String GETTASKS="select employees.manager_id,tasks.task_id,tasks.user_id,tasks.task,tasks.from_date,tasks.to_date,tasks.status from tasks join employees on tasks.user_id=employees.user_id where manager_id=?;";
	private final String DELETE="delete from tasks where task_id=?;";
	private final String ADD ="insert into tasks (user_id,task,from_date,to_date,status) values (?,?,?,?,?);";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<TasksModel> getTasks(String userId) {
		return jdbcTemplate.query(GET,new TasksMapper(),userId);
	}
	public boolean editStatus(TasksModel ship) {
		if(jdbcTemplate.update(UPDATE,ship.getStatus(),ship.getTaskId())!=0) {
			return true;
		}
		return false;
	}
	public List<EmployeeTasksModel> getAllTasks(String managerId){
		return jdbcTemplate.query(GETTASKS,new EmployeeTasksMapper(),managerId);
		
	}
	public boolean deleteTask(int taskId) {
		if(jdbcTemplate.update(DELETE,taskId)!=0) {
			return true;
		}
		return false;
	}
	public boolean addTask(TasksModel task) {
		if (jdbcTemplate.update(ADD,task.getUserId(),task.getTask(),task.getFromDate(),task.getToDate(),task.getStatus())!=0) {
			return true;
		}
		return false;
	}
}
