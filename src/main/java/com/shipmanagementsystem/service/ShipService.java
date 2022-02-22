package com.shipmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shipmanagementsystem.dao.ShipDao;
import com.shipmanagementsystem.model.ShipModel;
import com.shipmanagementsystem.model.ShipStoreModel;

@Service
public class ShipService {
	
	@Autowired
	private ShipDao shipdao;

	public List<ShipModel> getAllShipsOwned(){
	 return this.shipdao.getAllShipsOwned();
	}
	
	public List<ShipStoreModel> getAllShipsStore(){
		return this.shipdao.getAllShipsStore();
	}
	
	public boolean buyShip(ShipStoreModel ship) {
		return this.shipdao.buyShip(ship);
	}
	public boolean editShips(ShipModel ship) {
		return this.shipdao.editShips(ship);
	}
}
