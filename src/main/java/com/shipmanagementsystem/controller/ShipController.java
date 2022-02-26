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

import com.shipmanagementsystem.exceptions.ResourceNotFoundException;
import com.shipmanagementsystem.model.ShipModel;
import com.shipmanagementsystem.model.ShipStoreModel;
import com.shipmanagementsystem.service.ShipService;


/**
 * The Class ShipController.
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ShipController {

	/** The ship service. */
	@Autowired
	private ShipService shipService;
	
	/**
	 * Gets the all ships owned.
	 *
	 * @return the all ships owned
	 */
	@GetMapping("/ship")
	public ResponseEntity<Object> getAllShipsOwned() {
		return ResponseEntity.ok(shipService.getAllShipsOwned());
	}
	
	/**
	 * Gets the all ships store.
	 *
	 * @return the all ships store
	 */
	@GetMapping("/shipStore")
	public ResponseEntity<Object> getAllShipsStore() {
		return ResponseEntity.ok(shipService.getAllShipsStore());
	}
	
	/**
	 * Edits the ships.
	 *
	 * @param model the model
	 * @return the response entity
	 */
	@PutMapping("/ship")
	public ResponseEntity<Object> editShips(@RequestBody ShipModel model){
		boolean status = this.shipService.editShips(model);
		if (status) {
			return new ResponseEntity<Object>(HttpStatus.OK);
		} else {
			 throw new ResourceNotFoundException("Failed to edit Ships");
		}
	}
	
	/**
	 * Buy ships.
	 *
	 * @param model the model
	 * @return the response entity
	 */
	@PostMapping("/ship")
	public ResponseEntity<Object> buyShips(@RequestBody ShipStoreModel model) {
			boolean status = shipService.buyShip(model);
			if (status) {
				return new ResponseEntity<Object>(model, HttpStatus.CREATED);
			}
			
			 throw new ResourceNotFoundException("Failed to buy ship");
	}

}
