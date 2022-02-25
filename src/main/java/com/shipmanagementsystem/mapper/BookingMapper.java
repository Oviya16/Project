package com.shipmanagementsystem.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.shipmanagementsystem.model.BookingModel;

public class BookingMapper implements RowMapper<BookingModel> {

	@Override
	public BookingModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		BookingModel booking= new BookingModel();
		
		booking.setBookingId(rs.getInt("booking_id"));
		booking.setUserId(rs.getString("user_id"));
		booking.setShipId(rs.getInt("ship_id"));
		booking.setProduct(rs.getString("product"));
		booking.setQuantity(rs.getDouble("quantity"));
		booking.setAmount(rs.getDouble("amount"));
		return booking;
		
	}

}
