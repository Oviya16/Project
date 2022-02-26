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

import com.shipmanagementsystem.exceptions.ResourceNotFoundException;
import com.shipmanagementsystem.model.BookingModel;
import com.shipmanagementsystem.model.ShipDetailsModel;

import com.shipmanagementsystem.service.BookingService;



/**
 * The Class BookingController.
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class BookingController {

	/** The booking service. */
	@Autowired
	private BookingService bookingService;
	
	/**
	 * Gets the all passenger ships.
	 *
	 * @return the all passenger ships
	 */
	@GetMapping("/passenger")
	public ResponseEntity<Object> getAllPassengerShips() {
		return ResponseEntity.ok(bookingService.getAllPassengerShips());
	}
	
	/**
	 * Gets the all cargo ships.
	 *
	 * @return the all cargo ships
	 */
	@GetMapping("/cargo")
	public ResponseEntity<Object> getAllCargoShips() {
		return ResponseEntity.ok(bookingService.getAllCargoShips());
	}
	
	/**
	 * Edits the ships booking.
	 *
	 * @param model the model
	 * @return the response entity
	 */
	@PutMapping("/shipDetails")
	public ResponseEntity<Object> editShipsBooking(@RequestBody ShipDetailsModel model){
		boolean status = this.bookingService.editShipsBooking(model);
		if (status) {
			return new ResponseEntity<Object>(HttpStatus.OK);
		} else {
			throw new ResourceNotFoundException("Failed edit ships");
		}
	}
	
	/**
	 * Adds the bookings.
	 *
	 * @param ship the ship
	 * @return the response entity
	 */
	@PostMapping("/booking")
	public ResponseEntity<Object> AddBookings(@RequestBody BookingModel ship){
			boolean status = bookingService.AddBookings(ship);
			if (status) {
				return new ResponseEntity<Object>(ship, HttpStatus.CREATED);
			}
			throw new ResourceNotFoundException("Failed to add booking");
		}
	
	
	
	/**
	 * Gets the user bookings.
	 *
	 * @param userId the user id
	 * @return the user bookings
	 */
	@GetMapping("/bookings/{userId}")
	public ResponseEntity<Object> getuserBookings(@PathVariable String userId){
		return ResponseEntity.ok(bookingService.getuserBookings(userId));
	}
	
	/**
	 * Gets the all bookings.
	 *
	 * @return the all bookings
	 */
	@GetMapping("/allBookings")
	public ResponseEntity<Object> getAllBookings(){
		return ResponseEntity.ok(bookingService.getAllBookings());
	}
	
	/**
	 * Delete booking.
	 *
	 * @param bookingId the booking id
	 * @return the response entity
	 */
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> deleteBooking(@PathVariable("id") int bookingId){
		boolean status = this.bookingService.deleteBooking(bookingId);
		if (status) {
			return new ResponseEntity<Object>(HttpStatus.OK);
		} else {
			throw new ResourceNotFoundException("Failed to delete Booking");
		}
	}
}
