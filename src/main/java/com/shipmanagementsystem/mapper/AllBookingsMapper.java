package com.shipmanagementsystem.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.shipmanagementsystem.model.AllBookingsModel;

public class AllBookingsMapper implements RowMapper<AllBookingsModel>{

	@Override
	public AllBookingsModel mapRow(ResultSet rs, int rowNum) throws SQLException {
AllBookingsModel booking= new AllBookingsModel();
		
		booking.setUserId(rs.getString("user_id"));
	
		booking.setBookingId(rs.getInt("booking_id"));
		booking.setShipId(rs.getInt("ship_id"));
		booking.setShipName(rs.getString("ship_name"));
		booking.setShipType(rs.getString("ship_type"));
		booking.setSource(rs.getString("source"));
		booking.setDestination(rs.getString("destination"));
		booking.setDepartureDate(rs.getString("departure_date"));
		booking.setDepartureTime(rs.getString("departure_time"));
		booking.setArrivalDate(rs.getString("arrival_date"));
		booking.setArrivalTime(rs.getString("arrival_time"));
		booking.setProduct(rs.getString("product"));
		booking.setQuantity(rs.getDouble("quantity"));
		booking.setAmount(rs.getDouble("amount"));
		return booking;
		
	}

}
