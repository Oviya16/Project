package com.shipmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shipmanagementsystem.dao.RegisterDao;
import com.shipmanagementsystem.model.RegisterModel;
import com.shipmanagementsystem.model.TempModel;

@Service
public class RegisterService {

	@Autowired
	private RegisterDao registerDao;

	public List<RegisterModel> getAllUsers() {
		return registerDao.getAllUsers();
	}

	public boolean postUser(RegisterModel user) {
		return registerDao.insertUser(user);
	}

	public String checkLogin(RegisterModel user) {
		return this.registerDao.checkLogin(user);
	}
	public boolean approveUsers(RegisterModel user) {
		return this.registerDao.approveUsers(user);
	}
	public boolean rejectUsers(RegisterModel user) {
		return this.registerDao.rejectUsers(user);
		}
	public List<TempModel> getPendingUsers(){
		return this.registerDao.getPendingUsers();
	}
}