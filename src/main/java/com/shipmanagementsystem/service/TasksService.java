package com.shipmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shipmanagementsystem.dao.TasksDao;
import com.shipmanagementsystem.model.EmployeeTasksModel;
import com.shipmanagementsystem.model.TasksModel;



/**
 * The Class TasksService.
 */
@Service
public class TasksService {

	/** The tasks dao. */
	@Autowired
	private TasksDao tasksDao;
	
	/**
	 * Gets the tasks.
	 *
	 * @param userId the user id
	 * @return the tasks
	 */
	public List<TasksModel>  getTasks(String userId){
		 return tasksDao.getTasks(userId);
		}
	
	/**
	 * Edits the status.
	 *
	 * @param model the model
	 * @return true, if successful
	 */
	public boolean editStatus(TasksModel model) {
		return this.tasksDao.editStatus(model);
	}
	
	/**
	 * Gets the all tasks.
	 *
	 * @param managerId the manager id
	 * @return the all tasks
	 */
	public List<EmployeeTasksModel> getAllTasks(String managerId){
		return tasksDao.getAllTasks(managerId);
	}
	
	/**
	 * Delete task.
	 *
	 * @param taskId the task id
	 * @return true, if successful
	 */
	public boolean deleteTask(int taskId) {
		return this.tasksDao.deleteTask(taskId);
	}
	
	/**
	 * Adds the task.
	 *
	 * @param task the task
	 * @return true, if successful
	 */
	public boolean addTask(TasksModel task) {
		return this.tasksDao.addTask(task);
	}
}
