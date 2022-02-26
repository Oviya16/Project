package com.shipmanagementsystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.shipmanagementsystem.mapper.ShipMapper;
import com.shipmanagementsystem.mapper.ShipStoreMapper;
import com.shipmanagementsystem.model.ShipModel;
import com.shipmanagementsystem.model.ShipStoreModel;


/**
 * The Class ShipDao.
 */
@Repository
public class ShipDao {

	/** The update. */
	private final String UPDATE="update ship_owned set ship_number=?,ship_name=?,ship_model=? where ship_id=?;";
	
	/** The add. */
	private final String ADD="insert into ship_owned(ship_number,ship_name,ship_model) values (?,?,?);";
	
	/** The ship. */
	private final String SHIP="select * from ship_owned;";
	
	/** The shipstore. */
	private final String SHIPSTORE="select * from ship_store;";
	
	/** The jdbc template. */
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * Gets the all ships owned.
	 *
	 * @return the all ships owned
	 */
	public List<ShipModel> getAllShipsOwned(){
		return jdbcTemplate.query(SHIP, new ShipMapper());
	}
	
	/**
	 * Gets the all ships store.
	 *
	 * @return the all ships store
	 */
	public List<ShipStoreModel> getAllShipsStore(){
		return jdbcTemplate.query(SHIPSTORE, new ShipStoreMapper());
	}
	
	/**
	 * Buy ship.
	 *
	 * @param ship the ship
	 * @return true, if successful
	 */
	public boolean buyShip(ShipStoreModel ship) {
		if (jdbcTemplate.update(ADD,ship.getShipNumberStore(),ship.getShipNameStore(),ship.getShipModelStore())!=0) {
			return true;
		}
		return false;
	}
	
	/**
	 * Edits the ships.
	 *
	 * @param ship the ship
	 * @return true, if successful
	 */
	public boolean editShips(ShipModel ship) {
		if(jdbcTemplate.update(UPDATE, ship.getShipNumber(),ship.getShipName(),ship.getShipModel(),ship.getShipId())!=0) {
			return true;
		}
		return false;
	}
}
