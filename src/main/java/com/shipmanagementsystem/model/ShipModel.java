package com.shipmanagementsystem.model;

public class ShipModel {
	private int shipId;
	private String shipNumber;
	private String shipName;
	private String shipModel;
	
	public int getShipId() {
		return shipId;
	}
	public void setShipId(int shipId) {
		this.shipId = shipId;
	}
	public String getShipNumber() {
		return shipNumber;
	}
	public void setShipNumber(String shipNumber) {
		this.shipNumber = shipNumber;
	}
	public String getShipName() {
		return shipName;
	}
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	public String getShipModel() {
		return shipModel;
	}
	public void setShipModel(String shipModel) {
		this.shipModel = shipModel;
	}
	
	public ShipModel(int shipId, String shipNumber, String shipName, String shipModel) {
		super();
		this.shipId = shipId;
		this.shipNumber = shipNumber;
		this.shipName = shipName;
		this.shipModel = shipModel;
	}
	public ShipModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
