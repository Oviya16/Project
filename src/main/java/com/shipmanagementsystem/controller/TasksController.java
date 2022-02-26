package com.shipmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shipmanagementsystem.exceptions.ResourceNotFoundException;
import com.shipmanagementsystem.model.TasksModel;

import com.shipmanagementsystem.service.TasksService;


/**
 * The Class TasksController.
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TasksController {

	
	/** The tasks service. */
	@Autowired
	private TasksService tasksService;
	
	/**
	 * Gets the tasks.
	 *
	 * @param userId the user id
	 * @return the tasks
	 */
	@GetMapping("/tasks/{id}")
	public ResponseEntity<Object> getTasks(@PathVariable("id") String userId){
		return ResponseEntity.ok(tasksService.getTasks(userId));
}
	
	/**
	 * Edits the status.
	 *
	 * @param model the model
	 * @return the response entity
	 */
	@PutMapping("/editStatus")
	public ResponseEntity<Object> editStatus(@RequestBody TasksModel model){
		boolean status = this.tasksService.editStatus(model);
		if (status) {
			return new ResponseEntity<Object>(HttpStatus.OK);
		} else {
			 throw new ResourceNotFoundException("Failed to edit Status");
		}
	}
	
	/**
	 * Gets the alltasks.
	 *
	 * @param managerId the manager id
	 * @return the alltasks
	 */
	@GetMapping("/employeeTasks/{managerId}")
	public ResponseEntity<Object> getAlltasks(@PathVariable String managerId){
		return ResponseEntity.ok(tasksService.getAllTasks(managerId));
		
	}
	
	/**
	 * Delete task.
	 *
	 * @param taskId the task id
	 * @return the response entity
	 */
	@DeleteMapping("/deleteTask/{id}")
	public ResponseEntity<Object> deleteTask(@PathVariable("id") int taskId){
		boolean status = this.tasksService.deleteTask(taskId);
		if (status) {
			return new ResponseEntity<Object>(HttpStatus.OK);
		} else {
			 throw new ResourceNotFoundException("Failed to delete task");
		}
	}
	
	/**
	 * Adds the task.
	 *
	 * @param model the model
	 * @return the response entity
	 */
	@PostMapping("/addTask")
	public ResponseEntity<Object> addTask(@RequestBody TasksModel model) {
			boolean status = tasksService.addTask(model);
			if (status) {
				return new ResponseEntity<Object>(model, HttpStatus.CREATED);
			}
			
			 throw new ResourceNotFoundException("Failed to add task");
	}
}
