package com.shipmanagementsystem.model;



/**
 * The Class BookingModel.
 */
public class BookingModel {
	
	/** The booking id. */
	private int bookingId;
	
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
	
	/** The ship id. */
	private int shipId;
	
	/** The user id. */
	private String userId;
	
	/** The product. */
	private String product;
	
	/** The quantity. */
	private double quantity;
	
	/** The amount. */
	private double amount;
	
	/**
	 * Gets the ship id.
	 *
	 * @return the ship id
	 */
	public int getShipId() {
		return shipId;
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
	 * Sets the ship id.
	 *
	 * @param ship_id the new ship id
	 */
	public void setShipId(int ship_id) {
		this.shipId = ship_id;
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
	 * Instantiates a new booking model.
	 *
	 * @param bookingId the booking id
	 * @param shipId the ship id
	 * @param userId the user id
	 * @param product the product
	 * @param quantity the quantity
	 * @param amount the amount
	 */
	public BookingModel(int bookingId,int shipId, String userId, String product, double quantity, double amount) {
		super();
		this.bookingId=bookingId;
		this.shipId = shipId;
		this.userId = userId;
		this.product = product;
		this.quantity = quantity;
		this.amount = amount;
		
	}
	
	/**
	 * Instantiates a new booking model.
	 */
	public BookingModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
