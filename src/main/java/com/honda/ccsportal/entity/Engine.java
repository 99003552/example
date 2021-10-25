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
@Table(name = "engine")
public class Engine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "engine_id")
	private int engine_id;
	
	@Column(name = "model_id")
	private int model_id;
	
	@Column(name = "device_id", insertable=false ,updatable=false)
	private int device_id;
	
	@Column(name = "vehicle_id")
	private int vehicle_id;
	
	@Column(name = "position_id")
	private int position_id;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "horse_power")
	private String horse_power;
	
	@Column(name = "vin")
	private String vin;
	
	@Column(name = "engine_status")
	private String engine_status;
	
	@Column(name = "created_by")
	private String created_by;
	
	@Column(name = "created_ts")
	private Timestamp created_ts;
	
	@Column(name = "updated_by")
	private String updated_by;
	
	@Column(name = "updated_ts")
	private Timestamp updated_ts;
	
	@OneToOne
	@JoinColumn(name="device_id")
	private VehicleDevice vdObj;

	public int getEngine_id() {
		return engine_id;
	}

	public void setEngine_id(int engine_id) {
		this.engine_id = engine_id;
	}

	public int getModel_id() {
		return model_id;
	}

	public void setModel_id(int model_id) {
		this.model_id = model_id;
	}

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

	public int getPosition_id() {
		return position_id;
	}

	public void setPosition_id(int position_id) {
		this.position_id = position_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getHorse_power() {
		return horse_power;
	}

	public void setHorse_power(String horse_power) {
		this.horse_power = horse_power;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getEngine_status() {
		return engine_status;
	}

	public void setEngine_status(String engine_status) {
		this.engine_status = engine_status;
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

	public VehicleDevice getVdObj() {
		return vdObj;
	}

	public void setVdObj(VehicleDevice vdObj) {
		this.vdObj = vdObj;
	}

}
