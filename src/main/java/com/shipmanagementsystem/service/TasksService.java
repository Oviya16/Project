package com.shipmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shipmanagementsystem.dao.TasksDao;
import com.shipmanagementsystem.model.EmployeeTasksModel;
import com.shipmanagementsystem.model.TasksModel;

@Service
public class TasksService {

	@Autowired
	private TasksDao tasksDao;
	
	public List<TasksModel>  getTasks(String userId){
		 return tasksDao.getTasks(userId);
		}
	public boolean editStatus(TasksModel model) {
		return this.tasksDao.editStatus(model);
	}
	public List<EmployeeTasksModel> getAllTasks(String managerId){
		return tasksDao.getAllTasks(managerId);
	}
	public boolean deleteTask(int taskId) {
		return this.tasksDao.deleteTask(taskId);
	}
	public boolean addTask(TasksModel task) {
		return this.tasksDao.addTask(task);
	}
}
