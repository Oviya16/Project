package com.shipmanagementsystem.model;




/**
 * The Class EmployeeTasksModel.
 */
public class EmployeeTasksModel {
	
	/** The task id. */
	private int taskId;
	
	/** The manager id. */
	private String managerId;
	
	/** The user id. */
	private String userId;
	
	/** The task. */
	private String task;
	
	/** The from date. */
	private String fromDate;
	
	/** The to date. */
	private String toDate;
	
	/** The status. */
	private String status;
	
	/**
	 * Gets the task id.
	 *
	 * @return the task id
	 */
	public int getTaskId() {
		return taskId;
	}
	
	/**
	 * Sets the task id.
	 *
	 * @param taskId the new task id
	 */
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	
	/**
	 * Gets the manager id.
	 *
	 * @return the manager id
	 */
	public String getManagerId() {
		return managerId;
	}
	
	/**
	 * Sets the manager id.
	 *
	 * @param managerId the new manager id
	 */
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	
	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public String getUserId() {
		return userId;
	}
	
	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/**
	 * Gets the task.
	 *
	 * @return the task
	 */
	public String getTask() {
		return task;
	}
	
	/**
	 * Sets the task.
	 *
	 * @param task the new task
	 */
	public void setTask(String task) {
		this.task = task;
	}
	
	/**
	 * Gets the from date.
	 *
	 * @return the from date
	 */
	public String getFromDate() {
		return fromDate;
	}
	
	/**
	 * Sets the from date.
	 *
	 * @param fromDate the new from date
	 */
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	
	/**
	 * Gets the to date.
	 *
	 * @return the to date
	 */
	public String getToDate() {
		return toDate;
	}
	
	/**
	 * Sets the to date.
	 *
	 * @param toDate the new to date
	 */
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	
	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	
	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	/**
	 * Instantiates a new employee tasks model.
	 *
	 * @param taskId the task id
	 * @param managerId the manager id
	 * @param userId the user id
	 * @param task the task
	 * @param fromDate the from date
	 * @param toDate the to date
	 * @param status the status
	 */
	public EmployeeTasksModel(int taskId, String managerId, String userId, String task, String fromDate, String toDate,
			String status) {
		super();
		this.taskId = taskId;
		this.managerId = managerId;
		this.userId = userId;
		this.task = task;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.status = status;
	}
	
	/**
	 * Instantiates a new employee tasks model.
	 */
	public EmployeeTasksModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
