package com.shipmanagementsystem.model;

public class WalletModel {

	private int id;
	private double totalAmount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public WalletModel(int id, double totalAmount) {
		super();
		this.id = id;
		this.totalAmount = totalAmount;
	}
	public WalletModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
