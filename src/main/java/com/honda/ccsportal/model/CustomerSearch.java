package com.honda.ccsportal.model;

public class CustomerSearch {

	//private String tcu_id;
    public String boatName;
	private String TCUStatus;
	private String customer_id;
	//private String serialNumber;
	private String TcuNumber;
	private String ownername;
	
/*	public String getTcu_id() {
		return tcu_id;
	}
	public void setTcu_id(String tcu_id) {
		this.tcu_id = tcu_id;
	}
	*/
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	/*public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}*/
	public String getBoatName() {
		return boatName;
	}
	public void setBoatName(String boatName) {
		this.boatName = boatName;
	}

	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public String getTcuNumber() {
		return TcuNumber;
	}
	public void setTcuNumber(String tcuNumber) {
		TcuNumber = tcuNumber;
	}
	public String getTCUStatus() {
		return TCUStatus;
	}
	public void setTCUStatus(String tCUStatus) {
		TCUStatus = tCUStatus;
	}
	
}
