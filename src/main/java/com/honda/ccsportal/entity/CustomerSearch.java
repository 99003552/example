package com.honda.ccsportal.entity;

public class CustomerSearch {

	private String tcu_id;
    public String boatName;
	private String tcu_status;
	private int customer_id;
	private String serialNumber;
	
	public String getTcu_id() {
		return tcu_id;
	}
	public void setTcu_id(String tcu_id) {
		this.tcu_id = tcu_id;
	}
	public String getTcu_status() {
		return tcu_status;
	}
	public void setTcu_status(String tcu_status) {
		this.tcu_status = tcu_status;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getBoatName() {
		return boatName;
	}
	public void setBoatName(String boatName) {
		this.boatName = boatName;
	}
	
}
