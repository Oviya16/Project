package com.shipmanagementsystem.model;

import java.util.Date;

public class TempModel {
	private String firstName;
	private String lastName;
	private Date dob;
	private String gender;
	private String contactNumber;
	private String category;
	private String userId;
	private String password;
	private boolean rejected;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isRejected() {
		return rejected;
	}
	public void setRejected(boolean rejected) {
		this.rejected = rejected;
	}
	public TempModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TempModel(String firstName, String lastName, Date dob, String gender, String contactNumber, String category,
			String userId, String password, boolean rejected) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.category = category;
		this.userId = userId;
		this.password = password;
		this.rejected = rejected;
	}
	
}
