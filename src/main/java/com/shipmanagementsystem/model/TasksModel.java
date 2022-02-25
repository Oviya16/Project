package com.shipmanagementsystem.model;

public class TasksModel {
	private int taskId;
	private String userId;
	private String task;
	private String fromDate;
	private String toDate;
	private String status;
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public TasksModel(int taskId, String userId, String task, String fromDate, String toDate, String status) {
		super();
		this.taskId = taskId;
		this.userId = userId;
		this.task = task;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.status = status;
	}
	public TasksModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
