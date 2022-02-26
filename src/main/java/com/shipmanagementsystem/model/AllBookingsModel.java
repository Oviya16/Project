package com.shipmanagementsystem.model;


/**
 * The Class AllBookingsModel.
 */
public class AllBookingsModel {
	
	/** The booking id. */
	private int bookingId;
	
	/** The user id. */
	private String userId;
	
	/** The ship id. */
	private int shipId;
	
	/** The ship name. */
	private String shipName;
	
	/** The ship type. */
	private String shipType;
	
	/** The source. */
	private String source;
	
	/** The destination. */
	private String destination;
	
	/** The departure date. */
	private String departureDate;
	
	/** The departure time. */
	private String departureTime;
	
	/** The arrival date. */
	private String arrivalDate;
	
	/** The arrival time. */
	private String arrivalTime;
	
	/** The product. */
	private String product;
	
	/** The quantity. */
	private double quantity;
	
	/** The amount. */
	private double amount;
	
	/**
	 * Gets the booking id.
	 *
	 * @return the booking id
	 */
	public int getBookingId() {
		return bookingId;
	}
	
	/**
	 * Sets the booking id.
	 *
	 * @param bookingId the new booking id
	 */
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	
	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public String getUserId() {
		return userId;
	}
	
	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/**
	 * Gets the ship id.
	 *
	 * @return the ship id
	 */
	public int getShipId() {
		return shipId;
	}
	
	/**
	 * Sets the ship id.
	 *
	 * @param shipId the new ship id
	 */
	public void setShipId(int shipId) {
		this.shipId = shipId;
	}
	
	/**
	 * Gets the ship name.
	 *
	 * @return the ship name
	 */
	public String getShipName() {
		return shipName;
	}
	
	/**
	 * Sets the ship name.
	 *
	 * @param shipName the new ship name
	 */
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	
	/**
	 * Gets the ship type.
	 *
	 * @return the ship type
	 */
	public String getShipType() {
		return shipType;
	}
	
	/**
	 * Sets the ship type.
	 *
	 * @param shipType the new ship type
	 */
	public void setShipType(String shipType) {
		this.shipType = shipType;
	}
	
	/**
	 * Gets the source.
	 *
	 * @return the source
	 */
	public String getSource() {
		return source;
	}
	
	/**
	 * Sets the source.
	 *
	 * @param source the new source
	 */
	public void setSource(String source) {
		this.source = source;
	}
	
	/**
	 * Gets the destination.
	 *
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}
	
	/**
	 * Sets the destination.
	 *
	 * @param destination the new destination
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	/**
	 * Gets the departure date.
	 *
	 * @return the departure date
	 */
	public String getDepartureDate() {
		return departureDate;
	}
	
	/**
	 * Sets the departure date.
	 *
	 * @param departureDate the new departure date
	 */
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	
	/**
	 * Gets the departure time.
	 *
	 * @return the departure time
	 */
	public String getDepartureTime() {
		return departureTime;
	}
	
	/**
	 * Sets the departure time.
	 *
	 * @param departureTime the new departure time
	 */
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	
	/**
	 * Gets the arrival date.
	 *
	 * @return the arrival date
	 */
	public String getArrivalDate() {
		return arrivalDate;
	}
	
	/**
	 * Sets the arrival date.
	 *
	 * @param arrivalDate the new arrival date
	 */
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	
	/**
	 * Gets the arrival time.
	 *
	 * @return the arrival time
	 */
	public String getArrivalTime() {
		return arrivalTime;
	}
	
	/**
	 * Sets the arrival time.
	 *
	 * @param arrivalTime the new arrival time
	 */
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	/**
	 * Gets the product.
	 *
	 * @return the product
	 */
	public String getProduct() {
		return product;
	}
	
	/**
	 * Sets the product.
	 *
	 * @param product the new product
	 */
	public void setProduct(String product) {
		this.product = product;
	}
	
	/**
	 * Gets the quantity.
	 *
	 * @return the quantity
	 */
	public double getQuantity() {
		return quantity;
	}
	
	/**
	 * Sets the quantity.
	 *
	 * @param quantity the new quantity
	 */
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	/**
	 * Gets the amount.
	 *
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}
	
	/**
	 * Sets the amount.
	 *
	 * @param amount the new amount
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	/**
	 * Instantiates a new all bookings model.
	 *
	 * @param bookingId the booking id
	 * @param userId the user id
	 * @param shipId the ship id
	 * @param shipName the ship name
	 * @param shipType the ship type
	 * @param source the source
	 * @param destination the destination
	 * @param departureDate the departure date
	 * @param departureTime the departure time
	 * @param arrivalDate the arrival date
	 * @param arrivalTime the arrival time
	 * @param product the product
	 * @param quantity the quantity
	 * @param amount the amount
	 */
	public AllBookingsModel(int bookingId,String userId, int shipId, String shipName, String shipType, String source,
			String destination, String departureDate, String departureTime, String arrivalDate, String arrivalTime,
			String product, double quantity, double amount) {
		super();
		this.bookingId=bookingId;
		this.userId = userId;
		this.shipId = shipId;
		this.shipName = shipName;
		this.shipType = shipType;
		this.source = source;
		this.destination = destination;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.arrivalDate = arrivalDate;
		this.arrivalTime = arrivalTime;
		this.product = product;
		this.quantity = quantity;
		this.amount = amount;
	}
	
	/**
	 * Instantiates a new all bookings model.
	 */
	public AllBookingsModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
