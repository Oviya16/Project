package com.shipmanagementsystem.model;

public class ShipStoreModel {
	private String shipNumberStore;
	private String shipNameStore;
	private String shipModelStore;
	private double cost;
	public String getShipNumberStore() {
		return shipNumberStore;
	}
	public void setShipNumberStore(String shipNumberStore) {
		this.shipNumberStore = shipNumberStore;
	}
	public String getShipNameStore() {
		return shipNameStore;
	}
	public void setShipNameStore(String shipNameStore) {
		this.shipNameStore = shipNameStore;
	}
	public String getShipModelStore() {
		return shipModelStore;
	}
	public void setShipModelStore(String shipModelStore) {
		this.shipModelStore = shipModelStore;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public ShipStoreModel(String shipNumberStore, String shipNameStore, String shipModelStore, double cost) {
		super();
		this.shipNumberStore = shipNumberStore;
		this.shipNameStore = shipNameStore;
		this.shipModelStore = shipModelStore;
		this.cost = cost;
	}
	public ShipStoreModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
