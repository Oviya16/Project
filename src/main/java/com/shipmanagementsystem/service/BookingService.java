package com.shipmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shipmanagementsystem.dao.BookingDao;
import com.shipmanagementsystem.model.AllBookingsModel;
import com.shipmanagementsystem.model.BookingModel;
import com.shipmanagementsystem.model.ShipDetailsModel;


@Service
public class BookingService {

	@Autowired
	private BookingDao bookingDao;
	
	public List<ShipDetailsModel> getAllPassengerShips(){
		 return this.bookingDao.getAllPassengerShips();
		}
		
		public List<ShipDetailsModel> getAllCargoShips(){
			return this.bookingDao. getAllCargoShips();
		}
		public boolean editShipsBooking(ShipDetailsModel ship) {
			return this.bookingDao.editShipsBooking(ship);
		}
		public boolean AddBookings(BookingModel ship) {
			return this.bookingDao.AddBookings(ship);
		}
		public List<AllBookingsModel>  getuserBookings(String userId){
			 return this.bookingDao. getuserBookings(userId);
			}
		public List<AllBookingsModel> getAllBookings(){
			return this.bookingDao.getAllBookings();
		}
		public boolean deleteBooking(int bookingId) {
			return this.bookingDao.deleteBooking(bookingId);
		}
}
