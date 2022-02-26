package com.shipmanagementsystem.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.shipmanagementsystem.model.ShipModel;



/**
 * The Class ShipMapper.
 */
public class ShipMapper  implements RowMapper<ShipModel>{

	/**
	 * Map row.
	 *
	 * @param rs the rs
	 * @param rowNum the row num
	 * @return the ship model
	 * @throws SQLException the SQL exception
	 */
	@Override
	public ShipModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		ShipModel ship= new ShipModel();
		ship.setShipId(rs.getInt("ship_id"));
		ship.setShipNumber(rs.getString("ship_number"));
		ship.setShipName(rs.getString("ship_name"));
		ship.setShipModel(rs.getString("ship_model"));
	
		return ship;
	}

}
