package com.shipmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shipmanagementsystem.model.ShipModel;
import com.shipmanagementsystem.model.ShipStoreModel;
import com.shipmanagementsystem.service.ShipService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ShipController {

	@Autowired
	private ShipService shipService;
	
	@GetMapping("/ship")
	public ResponseEntity<Object> getAllShipsOwned() {
		return ResponseEntity.ok(shipService.getAllShipsOwned());
	}
	@GetMapping("/shipStore")
	public ResponseEntity<Object> getAllShipsStore() {
		return ResponseEntity.ok(shipService.getAllShipsStore());
	}
	
	@PutMapping("/ship")
	public ResponseEntity<Object> editShips(@RequestBody ShipModel model){
		boolean status = this.shipService.editShips(model);
		if (status) {
			return new ResponseEntity<Object>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/ship")
	public ResponseEntity<Object> buyShips(@RequestBody ShipStoreModel model) {
		try {
			boolean status = shipService.buyShip(model);
			if (!status) {
				throw new Exception();
			}
			return new ResponseEntity<Object>(model, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}

}
