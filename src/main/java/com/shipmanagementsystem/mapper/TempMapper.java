package com.shipmanagementsystem.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;


import com.shipmanagementsystem.model.TempModel;


/**
 * The Class TempMapper.
 */
public class TempMapper implements RowMapper<TempModel> {
	
	/**
	 * Map row.
	 *
	 * @param resultSet the result set
	 * @param i the i
	 * @return the temp model
	 * @throws SQLException the SQL exception
	 */
	@Override
	public TempModel mapRow(ResultSet resultSet, int i) throws SQLException {
		
		TempModel register = new TempModel();
		register.setFirstName(resultSet.getString("first_name"));
		register.setLastName(resultSet.getString("last_name"));
		register.setDob(new Date(resultSet.getDate("dob").getTime()));
		register.setGender(resultSet.getString("gender"));
		register.setContactNumber(resultSet.getString("contact_number"));
		register.setCategory(resultSet.getString("category"));
		register.setUserId(resultSet.getString("user_id"));
		register.setPassword(resultSet.getString("password"));
		register.setRejected(resultSet.getBoolean("rejected"));
		return register;

}


}
