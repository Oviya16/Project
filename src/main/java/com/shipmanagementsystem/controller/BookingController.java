package com.shipmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.shipmanagementsystem.model.BookingModel;
import com.shipmanagementsystem.model.ShipDetailsModel;

import com.shipmanagementsystem.service.BookingService;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class BookingController {

	@Autowired
	private BookingService bookingService;
	
	@GetMapping("/passenger")
	public ResponseEntity<Object> getAllPassengerShips() {
		return ResponseEntity.ok(bookingService.getAllPassengerShips());
	}
	@GetMapping("/cargo")
	public ResponseEntity<Object> getAllCargoShips() {
		return ResponseEntity.ok(bookingService.getAllCargoShips());
	}
	@PutMapping("/shipDetails")
	public ResponseEntity<Object> editShipsBooking(@RequestBody ShipDetailsModel model){
		boolean status = this.bookingService.editShipsBooking(model);
		if (status) {
			return new ResponseEntity<Object>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/booking")
	public ResponseEntity<Object> AddBookings(@RequestBody BookingModel ship){
		try {
			boolean status = bookingService.AddBookings(ship);
			if (!status) {
				throw new Exception();
			}
			return new ResponseEntity<Object>(ship, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/bookings/{userId}")
	public ResponseEntity<Object> getuserBookings(@PathVariable String userId){
		return ResponseEntity.ok(bookingService.getuserBookings(userId));
	}
	@GetMapping("/allBookings")
	public ResponseEntity<Object> getAllBookings(){
		return ResponseEntity.ok(bookingService.getAllBookings());
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> deleteBooking(@PathVariable("id") int bookingId){
		boolean status = this.bookingService.deleteBooking(bookingId);
		if (status) {
			return new ResponseEntity<Object>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
}
