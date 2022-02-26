package com.shipmanagementsystem.model;


/**
 * The Class ShipStoreModel.
 */
public class ShipStoreModel {
	
	/** The ship number store. */
	private String shipNumberStore;
	
	/** The ship name store. */
	private String shipNameStore;
	
	/** The ship model store. */
	private String shipModelStore;
	
	/** The cost. */
	private double cost;
	
	/**
	 * Gets the ship number store.
	 *
	 * @return the ship number store
	 */
	public String getShipNumberStore() {
		return shipNumberStore;
	}
	
	/**
	 * Sets the ship number store.
	 *
	 * @param shipNumberStore the new ship number store
	 */
	public void setShipNumberStore(String shipNumberStore) {
		this.shipNumberStore = shipNumberStore;
	}
	
	/**
	 * Gets the ship name store.
	 *
	 * @return the ship name store
	 */
	public String getShipNameStore() {
		return shipNameStore;
	}
	
	/**
	 * Sets the ship name store.
	 *
	 * @param shipNameStore the new ship name store
	 */
	public void setShipNameStore(String shipNameStore) {
		this.shipNameStore = shipNameStore;
	}
	
	/**
	 * Gets the ship model store.
	 *
	 * @return the ship model store
	 */
	public String getShipModelStore() {
		return shipModelStore;
	}
	
	/**
	 * Sets the ship model store.
	 *
	 * @param shipModelStore the new ship model store
	 */
	public void setShipModelStore(String shipModelStore) {
		this.shipModelStore = shipModelStore;
	}
	
	/**
	 * Gets the cost.
	 *
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
	
	/**
	 * Sets the cost.
	 *
	 * @param cost the new cost
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	/**
	 * Instantiates a new ship store model.
	 *
	 * @param shipNumberStore the ship number store
	 * @param shipNameStore the ship name store
	 * @param shipModelStore the ship model store
	 * @param cost the cost
	 */
	public ShipStoreModel(String shipNumberStore, String shipNameStore, String shipModelStore, double cost) {
		super();
		this.shipNumberStore = shipNumberStore;
		this.shipNameStore = shipNameStore;
		this.shipModelStore = shipModelStore;
		this.cost = cost;
	}
	
	/**
	 * Instantiates a new ship store model.
	 */
	public ShipStoreModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
