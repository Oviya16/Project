package com.shipmanagementsystem.model;

public class BookingModel {
	private int bookingId;
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	private int shipId;
	private String userId;
	private String product;
	private double quantity;
	private double amount;
	
	public int getShipId() {
		return shipId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setShipId(int ship_id) {
		this.shipId = ship_id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public BookingModel(int bookingId,int shipId, String userId, String product, double quantity, double amount) {
		super();
		this.bookingId=bookingId;
		this.shipId = shipId;
		this.userId = userId;
		this.product = product;
		this.quantity = quantity;
		this.amount = amount;
		
	}
	public BookingModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
