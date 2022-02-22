package com.shipmanagementsystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.shipmanagementsystem.mapper.ShipMapper;
import com.shipmanagementsystem.mapper.ShipStoreMapper;
import com.shipmanagementsystem.model.ShipModel;
import com.shipmanagementsystem.model.ShipStoreModel;

@Repository
public class ShipDao {

	private final String UPDATE="update ship_owned set ship_number=?,ship_name=?,ship_model=? where ship_id=?;";
	private final String ADD="insert into ship_owned(ship_number,ship_name,ship_model) values (?,?,?);";
	private final String SHIP="select * from ship_owned;";
	private final String SHIPSTORE="select * from ship_store;";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<ShipModel> getAllShipsOwned(){
		return jdbcTemplate.query(SHIP, new ShipMapper());
	}
	public List<ShipStoreModel> getAllShipsStore(){
		return jdbcTemplate.query(SHIPSTORE, new ShipStoreMapper());
	}
	
	public boolean buyShip(ShipStoreModel ship) {
		if (jdbcTemplate.update(ADD,ship.getShipNumberStore(),ship.getShipNameStore(),ship.getShipModelStore())!=0) {
			return true;
		}
		return false;
	}
	public boolean editShips(ShipModel ship) {
		if(jdbcTemplate.update(UPDATE, ship.getShipNumber(),ship.getShipName(),ship.getShipModel(),ship.getShipId())!=0) {
			return true;
		}
		return false;
	}
}
