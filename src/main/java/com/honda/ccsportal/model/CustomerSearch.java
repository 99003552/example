package com.honda.ccsportal.model;

public class CustomerSearch {

	private String tcu_id;
    public String boatName;
	private String tcu_status;
	private String customer_id;
	private String serialNumber;
	private String hullnumber;
	
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
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
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
	public String getHullnumber() {
		return hullnumber;
	}
	public void setHullnumber(String hullnumber) {
		this.hullnumber = hullnumber;
	}
	
}
