package com.shipmanagementsystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.shipmanagementsystem.mapper.AllBookingsMapper;
import com.shipmanagementsystem.mapper.ShipDetailsMapper;
import com.shipmanagementsystem.model.AllBookingsModel;
import com.shipmanagementsystem.model.BookingModel;
import com.shipmanagementsystem.model.ShipDetailsModel;




/**
 * The Class BookingDao.
 */
@Repository
public class BookingDao {
	
	/** The passenger. */
	private final String PASSENGER="select * from ship_details where ship_type='Passenger';";
	
	/** The cargo. */
	private final String CARGO="select * from ship_details where ship_type='Cargo';";
	
	/** The update. */
	private final String UPDATE="update ship_details set product=?,quantity=?,amount=? where ship_id=?;";
	
	/** The add. */
	private final String ADD="insert into booking(ship_id,user_id,product,quantity,amount) values (?,?,?,?,?);";
	
	/** The delete. */
	private final String DELETE="delete from booking where booking_id=?;";
	
	/** The view. */
	private final String VIEW="select booking.booking_id,booking.user_id,ship_details.ship_id,ship_details.ship_name,ship_details.ship_type,ship_details.source,ship_details.destination,ship_details.departure_date,ship_details.departure_time,ship_details.arrival_date,ship_details.arrival_time,booking.product,booking.quantity,booking.amount from ship_details join booking on ship_details.ship_id =booking.ship_id where user_id=?;";
	
	/** The viewall. */
	private final String VIEWALL="select booking.booking_id,booking.user_id,ship_details.ship_id,ship_details.ship_name,ship_details.ship_type,ship_details.source,ship_details.destination,ship_details.departure_date,ship_details.departure_time,ship_details.arrival_date,ship_details.arrival_time,booking.product,booking.quantity,booking.amount from ship_details join booking on ship_details.ship_id =booking.ship_id;";
	
	/** The jdbc template. */
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * Gets the user bookings.
	 *
	 * @param userId the user id
	 * @return the user bookings
	 */
	public List<AllBookingsModel> getuserBookings(String userId) {
		return jdbcTemplate.query(VIEW,new AllBookingsMapper(),userId);
	}
	
	/**
	 * Gets the all bookings.
	 *
	 * @return the all bookings
	 */
	public List<AllBookingsModel> getAllBookings() {
		return jdbcTemplate.query(VIEWALL,new AllBookingsMapper());
	}
	
	/**
	 * Delete booking.
	 *
	 * @param bookingId the booking id
	 * @return true, if successful
	 */
	public boolean deleteBooking(int bookingId) {
		if(jdbcTemplate.update(DELETE,bookingId)!=0) {
			return true;
		}
		return false;
	}
	
	/**
	 * Gets the all passenger ships.
	 *
	 * @return the all passenger ships
	 */
	public List<ShipDetailsModel> getAllPassengerShips(){
		return jdbcTemplate.query(PASSENGER, new ShipDetailsMapper());
	}
	
	/**
	 * Gets the all cargo ships.
	 *
	 * @return the all cargo ships
	 */
	public List<ShipDetailsModel> getAllCargoShips(){
		return jdbcTemplate.query(CARGO, new ShipDetailsMapper());
	}
	
	/**
	 * Edits the ships booking.
	 *
	 * @param ship the ship
	 * @return true, if successful
	 */
	public boolean editShipsBooking(ShipDetailsModel ship) {
		if(jdbcTemplate.update(UPDATE,ship.getProduct(),ship.getQuantity(),(ship.getQuantity()*ship.getTicketCost()),ship.getShipId())!=0) {
			return true;
		}
		return false;
	}
	
	/**
	 * Adds the bookings.
	 *
	 * @param ship the ship
	 * @return true, if successful
	 */
	public boolean AddBookings(BookingModel ship) {
		if(jdbcTemplate.update(ADD,ship.getShipId(),ship.getUserId(),ship.getProduct(),ship.getQuantity(),ship.getAmount())!=0) {
			return true;
		}
		return false;
	}
}
