package com.shipmanagementsystem.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.shipmanagementsystem.model.BookingModel;


/**
 * The Class BookingMapper.
 */
public class BookingMapper implements RowMapper<BookingModel> {

	/**
	 * Map row.
	 *
	 * @param rs the rs
	 * @param rowNum the row num
	 * @return the booking model
	 * @throws SQLException the SQL exception
	 */
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
