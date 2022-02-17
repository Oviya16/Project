package com.shipmanagementsystem.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.shipmanagementsystem.mapper.RegisterMapper;
import com.shipmanagementsystem.model.RegisterModel;

@Repository
public class RegisterDao {

	private final String SELECT = "select * from users;";
	private final String INSERT="insert into users(first_name,last_name,dob,gender,contact_number,category,user_id,password) values(?,?,?,?,?,?,?,?);";
	private final String LOGIN = "select password from users where user_id = ? ";
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public List<RegisterModel> getAllUsers(){
		return jdbcTemplate.query(SELECT, new RegisterMapper());
	}
	
	public boolean insertUser(RegisterModel user) {
		java.sql.Date date = new java.sql.Date(user.getDob().getTime());
		if (jdbcTemplate.update(INSERT, user.getFirstName(), user.getLastName(),
				date,user.getGender(),user.getContactNumber(),user.getCategory(), user.getUserId()
				,user.getPassword()) != 0) {
			return true;
		}
		return false;
	}
	public String checkLogin(RegisterModel user) {
		String logginStatus;
		try {
			String password = this.jdbcTemplate.queryForObject(LOGIN, String.class, new Object[] { user.getUserId() });
			if (password.equals(user.getPassword())) {
				logginStatus="yes";
			} else {
				logginStatus="password";
			}
		} catch (Exception e) {
			logginStatus="userId";
		}
		return logginStatus;
	}
}