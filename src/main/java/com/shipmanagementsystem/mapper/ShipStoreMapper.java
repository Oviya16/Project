package com.shipmanagementsystem.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.shipmanagementsystem.model.ShipStoreModel;

public class ShipStoreMapper implements RowMapper<ShipStoreModel>{

	@Override
	public ShipStoreModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		ShipStoreModel ship= new ShipStoreModel();
		ship.setShipNumberStore(rs.getString("ship_numberS"));
		ship.setShipNameStore(rs.getString("ship_nameS"));
		ship.setShipModelStore(rs.getString("ship_modelS"));
		ship.setCost(rs.getDouble("ship_cost"));
		return ship;
	}

}
