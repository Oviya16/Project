package com.shipmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shipmanagementsystem.dao.ShipDao;
import com.shipmanagementsystem.model.ShipModel;
import com.shipmanagementsystem.model.ShipStoreModel;

/**
 * The Class ShipService.
 */
@Service
public class ShipService {
	
	/** The shipdao. */
	@Autowired
	private ShipDao shipdao;

	/**
	 * Gets the all ships owned.
	 *
	 * @return the all ships owned
	 */
	public List<ShipModel> getAllShipsOwned(){
	 return this.shipdao.getAllShipsOwned();
	}
	
	/**
	 * Gets the all ships store.
	 *
	 * @return the all ships store
	 */
	public List<ShipStoreModel> getAllShipsStore(){
		return this.shipdao.getAllShipsStore();
	}
	
	/**
	 * Buy ship.
	 *
	 * @param ship the ship
	 * @return true, if successful
	 */
	public boolean buyShip(ShipStoreModel ship) {
		return this.shipdao.buyShip(ship);
	}
	
	/**
	 * Edits the ships.
	 *
	 * @param ship the ship
	 * @return true, if successful
	 */
	public boolean editShips(ShipModel ship) {
		return this.shipdao.editShips(ship);
	}
}
