package com.shipmanagementsystem.mapper;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.shipmanagementsystem.model.RegisterModel;

public class RegisterMapper implements RowMapper<RegisterModel> {
	
	@Override
	public RegisterModel mapRow(ResultSet resultSet, int i) throws SQLException {
		
		RegisterModel register = new RegisterModel();
		register.setFirstName(resultSet.getString("first_name"));
		register.setLastName(resultSet.getString("last_name"));
		register.setDob(new Date(resultSet.getDate("dob").getTime()));
		register.setGender(resultSet.getString("gender"));
		register.setContactNumber(resultSet.getString("contact_number"));
		register.setCategory(resultSet.getString("category"));
		register.setUserId(resultSet.getString("user_id"));
		register.setPassword(resultSet.getString("password"));
		return register;

}
}
