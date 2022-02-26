package com.shipmanagementsystem.model;

import java.util.Date;


/**
 * The Class TempModel.
 */
public class TempModel {
	
	/** The first name. */
	private String firstName;
	
	/** The last name. */
	private String lastName;
	
	/** The dob. */
	private Date dob;
	
	/** The gender. */
	private String gender;
	
	/** The contact number. */
	private String contactNumber;
	
	/** The category. */
	private String category;
	
	/** The user id. */
	private String userId;
	
	/** The password. */
	private String password;
	
	/** The rejected. */
	private boolean rejected;
	
	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Gets the dob.
	 *
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	
	/**
	 * Sets the dob.
	 *
	 * @param dob the new dob
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	/**
	 * Gets the gender.
	 *
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	
	/**
	 * Sets the gender.
	 *
	 * @param gender the new gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/**
	 * Gets the contact number.
	 *
	 * @return the contact number
	 */
	public String getContactNumber() {
		return contactNumber;
	}
	
	/**
	 * Sets the contact number.
	 *
	 * @param contactNumber the new contact number
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	/**
	 * Gets the category.
	 *
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	
	/**
	 * Sets the category.
	 *
	 * @param category the new category
	 */
	public void setCategory(String category) {
		this.category = category;
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
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * Checks if is rejected.
	 *
	 * @return true, if is rejected
	 */
	public boolean isRejected() {
		return rejected;
	}
	
	/**
	 * Sets the rejected.
	 *
	 * @param rejected the new rejected
	 */
	public void setRejected(boolean rejected) {
		this.rejected = rejected;
	}
	
	/**
	 * Instantiates a new temp model.
	 */
	public TempModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Instantiates a new temp model.
	 *
	 * @param firstName the first name
	 * @param lastName the last name
	 * @param dob the dob
	 * @param gender the gender
	 * @param contactNumber the contact number
	 * @param category the category
	 * @param userId the user id
	 * @param password the password
	 * @param rejected the rejected
	 */
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
