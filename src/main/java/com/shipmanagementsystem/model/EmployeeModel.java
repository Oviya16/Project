package com.shipmanagementsystem.model;



/**
 * The Class EmployeeModel.
 */
public class EmployeeModel {
	
	/** The user id. */
	private String userId;
	
	/** The level. */
	private String level;
	
	/** The salary. */
	private String salary;
	
	/** The manager. */
	private String manager;
	
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
	 * Gets the level.
	 *
	 * @return the level
	 */
	public String getLevel() {
		return level;
	}
	
	/**
	 * Sets the level.
	 *
	 * @param level the new level
	 */
	public void setLevel(String level) {
		this.level = level;
	}
	
	/**
	 * Gets the salary.
	 *
	 * @return the salary
	 */
	public String getSalary() {
		return salary;
	}
	
	/**
	 * Sets the salary.
	 *
	 * @param salary the new salary
	 */
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	/**
	 * Gets the manager.
	 *
	 * @return the manager
	 */
	public String getManager() {
		return manager;
	}
	
	/**
	 * Sets the manager.
	 *
	 * @param manager the new manager
	 */
	public void setManager(String manager) {
		this.manager = manager;
	}
	
	/**
	 * Instantiates a new employee model.
	 *
	 * @param userId the user id
	 * @param level the level
	 * @param salary the salary
	 * @param manager the manager
	 */
	public EmployeeModel(String userId, String level, String salary, String manager) {
		super();
		this.userId = userId;
		this.level = level;
		this.salary = salary;
		this.manager = manager;
	}
	
	/**
	 * Instantiates a new employee model.
	 */
	public EmployeeModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
