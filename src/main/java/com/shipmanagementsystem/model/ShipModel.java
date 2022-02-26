package com.shipmanagementsystem.model;


/**
 * The Class ShipModel.
 */
public class ShipModel {
	
	/** The ship id. */
	private int shipId;
	
	/** The ship number. */
	private String shipNumber;
	
	/** The ship name. */
	private String shipName;
	
	/** The ship model. */
	private String shipModel;
	
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
	 * Gets the ship number.
	 *
	 * @return the ship number
	 */
	public String getShipNumber() {
		return shipNumber;
	}
	
	/**
	 * Sets the ship number.
	 *
	 * @param shipNumber the new ship number
	 */
	public void setShipNumber(String shipNumber) {
		this.shipNumber = shipNumber;
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
	 * Gets the ship model.
	 *
	 * @return the ship model
	 */
	public String getShipModel() {
		return shipModel;
	}
	
	/**
	 * Sets the ship model.
	 *
	 * @param shipModel the new ship model
	 */
	public void setShipModel(String shipModel) {
		this.shipModel = shipModel;
	}
	
	/**
	 * Instantiates a new ship model.
	 *
	 * @param shipId the ship id
	 * @param shipNumber the ship number
	 * @param shipName the ship name
	 * @param shipModel the ship model
	 */
	public ShipModel(int shipId, String shipNumber, String shipName, String shipModel) {
		super();
		this.shipId = shipId;
		this.shipNumber = shipNumber;
		this.shipName = shipName;
		this.shipModel = shipModel;
	}
	
	/**
	 * Instantiates a new ship model.
	 */
	public ShipModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
