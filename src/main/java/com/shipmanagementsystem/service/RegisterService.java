package com.shipmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shipmanagementsystem.dao.RegisterDao;
import com.shipmanagementsystem.model.RegisterModel;
import com.shipmanagementsystem.model.TempModel;


/**
 * The Class RegisterService.
 */
@Service
public class RegisterService {

	/** The register dao. */
	@Autowired
	private RegisterDao registerDao;

	/**
	 * Gets the all users.
	 *
	 * @return the all users
	 */
	public List<RegisterModel> getAllUsers() {
		return registerDao.getAllUsers();
	}

	/**
	 * Post user.
	 *
	 * @param user the user
	 * @return true, if successful
	 */
	public boolean postUser(RegisterModel user) {
		return registerDao.insertUser(user);
	}

	/**
	 * Check login.
	 *
	 * @param user the user
	 * @return the string
	 */
	public String checkLogin(RegisterModel user) {
		return this.registerDao.checkLogin(user);
	}
	
	/**
	 * Approve users.
	 *
	 * @param user the user
	 * @return true, if successful
	 */
	public boolean approveUsers(RegisterModel user) {
		return this.registerDao.approveUsers(user);
	}
	
	/**
	 * Reject users.
	 *
	 * @param user the user
	 * @return true, if successful
	 */
	public boolean rejectUsers(RegisterModel user) {
		return this.registerDao.rejectUsers(user);
		}
	
	/**
	 * Gets the pending users.
	 *
	 * @return the pending users
	 */
	public List<TempModel> getPendingUsers(){
		return this.registerDao.getPendingUsers();
	}
}