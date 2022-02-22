package com.shipmanagementsystem.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.shipmanagementsystem.model.ShipModel;

public class ShipMapper  implements RowMapper<ShipModel>{

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
