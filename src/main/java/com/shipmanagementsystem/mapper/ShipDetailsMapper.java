package com.shipmanagementsystem.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.shipmanagementsystem.model.ShipDetailsModel;


/**
 * The Class ShipDetailsMapper.
 */
public class ShipDetailsMapper  implements RowMapper<ShipDetailsModel> {

	/**
	 * Map row.
	 *
	 * @param rs the rs
	 * @param rowNum the row num
	 * @return the ship details model
	 * @throws SQLException the SQL exception
	 */
	@Override
	public ShipDetailsModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		ShipDetailsModel ship= new ShipDetailsModel();
		ship.setShipId(rs.getInt("ship_id"));
		ship.setShipName(rs.getString("ship_name"));
		ship.setShipType(rs.getString("ship_type"));
		ship.setSource(rs.getString("source"));
		ship.setDestination(rs.getString("destination"));
		ship.setDepartureDate(rs.getString("departure_date"));
		ship.setDepartureTime(rs.getString("departure_time"));
		ship.setArrivalDate(rs.getString("arrival_date"));
		ship.setArrivalTime(rs.getString("arrival_time"));
		ship.setTicketsAvailable(rs.getString("tickets_available"));
		ship.setTicketCost(rs.getDouble("ticket_cost"));
		ship.setProduct(rs.getString("product"));
		ship.setQuantity(rs.getDouble("quantity"));
		ship.setAmount(rs.getDouble("amount"));
		return ship;
	}
}
