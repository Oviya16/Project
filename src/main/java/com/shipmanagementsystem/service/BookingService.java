package com.shipmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shipmanagementsystem.dao.BookingDao;
import com.shipmanagementsystem.model.AllBookingsModel;
import com.shipmanagementsystem.model.BookingModel;
import com.shipmanagementsystem.model.ShipDetailsModel;


/**
 * The Class BookingService.
 */
@Service
public class BookingService {

	/** The booking dao. */
	@Autowired
	private BookingDao bookingDao;
	
	/**
	 * Gets the all passenger ships.
	 *
	 * @return the all passenger ships
	 */
	public List<ShipDetailsModel> getAllPassengerShips(){
		 return this.bookingDao.getAllPassengerShips();
		}
		
		/**
		 * Gets the all cargo ships.
		 *
		 * @return the all cargo ships
		 */
		public List<ShipDetailsModel> getAllCargoShips(){
			return this.bookingDao. getAllCargoShips();
		}
		
		/**
		 * Edits the ships booking.
		 *
		 * @param ship the ship
		 * @return true, if successful
		 */
		public boolean editShipsBooking(ShipDetailsModel ship) {
			return this.bookingDao.editShipsBooking(ship);
		}
		
		/**
		 * Adds the bookings.
		 *
		 * @param ship the ship
		 * @return true, if successful
		 */
		public boolean AddBookings(BookingModel ship) {
			return this.bookingDao.AddBookings(ship);
		}
		
		/**
		 * Gets the user bookings.
		 *
		 * @param userId the user id
		 * @return the user bookings
		 */
		public List<AllBookingsModel>  getuserBookings(String userId){
			 return this.bookingDao. getuserBookings(userId);
			}
		
		/**
		 * Gets the all bookings.
		 *
		 * @return the all bookings
		 */
		public List<AllBookingsModel> getAllBookings(){
			return this.bookingDao.getAllBookings();
		}
		
		/**
		 * Delete booking.
		 *
		 * @param bookingId the booking id
		 * @return true, if successful
		 */
		public boolean deleteBooking(int bookingId) {
			return this.bookingDao.deleteBooking(bookingId);
		}
}
