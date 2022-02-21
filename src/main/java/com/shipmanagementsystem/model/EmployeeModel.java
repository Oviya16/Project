package com.shipmanagementsystem.model;

public class EmployeeModel {
	private String userId;
	private String level;
	private String salary;
	private String manager;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public EmployeeModel(String userId, String level, String salary, String manager) {
		super();
		this.userId = userId;
		this.level = level;
		this.salary = salary;
		this.manager = manager;
	}
	public EmployeeModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
