package com.shipmanagementsystem.model;



/**
 * The Class WalletModel.
 */
public class WalletModel {

	/** The id. */
	private int id;
	
	/** The total amount. */
	private double totalAmount;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Gets the total amount.
	 *
	 * @return the total amount
	 */
	public double getTotalAmount() {
		return totalAmount;
	}
	
	/**
	 * Sets the total amount.
	 *
	 * @param totalAmount the new total amount
	 */
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	/**
	 * Instantiates a new wallet model.
	 *
	 * @param id the id
	 * @param totalAmount the total amount
	 */
	public WalletModel(int id, double totalAmount) {
		super();
		this.id = id;
		this.totalAmount = totalAmount;
	}
	
	/**
	 * Instantiates a new wallet model.
	 */
	public WalletModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
