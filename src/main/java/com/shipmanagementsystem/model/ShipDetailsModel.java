package com.shipmanagementsystem.model;

public class ShipDetailsModel {
	  private int shipId;
	  private String shipName;
	  private String shipType;
	  private String source;
	  private String destination;
	  private String departureDate;
	  private String departureTime;
	  private String arrivalDate;
	  private String arrivalTime;
	  private String  ticketsAvailable;
	  private double ticketCost;
	  private String  product;
	  private double  quantity;
	  private double amount; 
	public int getShipId() {
		return shipId;
	}
	public void setShipId(int shipId) {
		this.shipId = shipId;
	}
	public String getShipName() {
		return shipName;
	}
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	public String getShipType() {
		return shipType;
	}
	public void setShipType(String shipType) {
		this.shipType = shipType;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getTicketsAvailable() {
		return ticketsAvailable;
	}
	public void setTicketsAvailable(String ticketsAvailable) {
		this.ticketsAvailable = ticketsAvailable;
	}
	public double getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(double ticketCost) {
		this.ticketCost = ticketCost;
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
	public ShipDetailsModel(int shipId, String shipName, String shipType, String source, String destination,
			String departureDate, String departureTime, String arrivalDate, String arrivalTime, String ticketsAvailable,
			double ticketCost, String product, double quantity, double amount) {
		super();
		this.shipId = shipId;
		this.shipName = shipName;
		this.shipType = shipType;
		this.source = source;
		this.destination = destination;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.arrivalDate = arrivalDate;
		this.arrivalTime = arrivalTime;
		this.ticketsAvailable = ticketsAvailable;
		this.ticketCost = ticketCost;
		this.product = product;
		this.quantity = quantity;
		this.amount = amount;
	}
	public ShipDetailsModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	   
}
