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


import com.shipmanagementsystem.model.TasksModel;

import com.shipmanagementsystem.service.TasksService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TasksController {

	
	@Autowired
	private TasksService tasksService;
	
	@GetMapping("/tasks/{id}")
	public ResponseEntity<Object> getTasks(@PathVariable("id") String userId){
		return ResponseEntity.ok(tasksService.getTasks(userId));
}
	@PutMapping("/editStatus")
	public ResponseEntity<Object> editStatus(@RequestBody TasksModel model){
		boolean status = this.tasksService.editStatus(model);
		if (status) {
			return new ResponseEntity<Object>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
	@GetMapping("/employeeTasks/{managerId}")
	public ResponseEntity<Object> getAlltasks(@PathVariable String managerId){
		return ResponseEntity.ok(tasksService.getAllTasks(managerId));
		
	}
	@DeleteMapping("/deleteTask/{id}")
	public ResponseEntity<Object> deleteTask(@PathVariable("id") int taskId){
		boolean status = this.tasksService.deleteTask(taskId);
		if (status) {
			return new ResponseEntity<Object>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
	@PostMapping("/addTask")
	public ResponseEntity<Object> addTask(@RequestBody TasksModel model) {
		try {
			boolean status = tasksService.addTask(model);
			if (!status) {
				throw new Exception();
			}
			return new ResponseEntity<Object>(model, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
}
