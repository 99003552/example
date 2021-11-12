package com.honda.ccsportal.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle_device")
public class VehicleDevice {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "device_id")
	private int device_id;
    
	@Column(name = "vehicle_id", insertable=false ,updatable=false)
	private int vehicle_id;
	
	@Column(name = "device_type")
	private String device_type;
	
	@Column(name = "created_by")
	private String created_by;
	
	@Column(name = "created_ts")
	private Timestamp created_ts;
	
	@Column(name = "updated_by")
	private String updated_by;
	
	@Column(name = "updated_ts")
	private Timestamp updated_ts;
	
	@OneToOne
	@JoinColumn(name="vehicle_id")
	private Vehicle vehicleObj;

	public int getDevice_id() {
		return device_id;
	}

	public void setDevice_id(int device_id) {
		this.device_id = device_id;
	}

	public int getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}

	public String getDevice_type() {
		return device_type;
	}

	public void setDevice_type(String device_type) {
		this.device_type = device_type;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public Timestamp getCreated_ts() {
		return created_ts;
	}

	public void setCreated_ts(Timestamp created_ts) {
		this.created_ts = created_ts;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

	public Timestamp getUpdated_ts() {
		return updated_ts;
	}

	public void setUpdated_ts(Timestamp updated_ts) {
		this.updated_ts = updated_ts;
	}

	public Vehicle getVehicleObj() {
		return vehicleObj;
	}

	public void setVehicleObj(Vehicle vehicleObj) {
		this.vehicleObj = vehicleObj;
	}
}
