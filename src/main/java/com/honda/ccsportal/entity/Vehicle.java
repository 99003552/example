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
@Table(name = "vehicle")
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vehicle_id")
	private int vehicle_id;
	
	@Column(name = "customer_id",insertable=false,updatable=false)
	private int customer_id;
	
	@Column(name = "model_id")
	private int model_id;
	
	@Column(name = "country_code")
	private String country_code;
	
	@Column(name = "vehicle_uuid")
	private String vehicle_uuid;
	
	@Column(name = "vehicle_name")
	private String vehicle_name;
	
	@Column(name = "vehicle_image_key")
	private String vehicle_image_key;
	
	@Column(name = "img_bucket_name")
	private String img_bucket_name;
	
	@Column(name = "vehicle_hin")
	private String vehicle_hin;
	
	@Column(name = "vehicle_length")
	private int vehicle_length;
	
	@Column(name = "engine_count")
	private int engine_count;
	
	@Column(name = "default_vehicle")
	private boolean default_vehicle;
	
	@Column(name = "door_alarm_enable")
	private boolean door_alarm_enable;
	
	@Column(name = "door_alarm_from")
	private Timestamp door_alarm_from;
	
	@Column(name = "door_alarm_to")
	private Timestamp door_alarm_to;
	
	@Column(name = "created_by")
	private String created_by;
	
	@Column(name = "created_ts")
	private Timestamp created_ts;
	
	@Column(name = "updated_by")
	private String updated_by;

	@OneToOne
	@JoinColumn(name="customer_id")
	private Customer cdObj;
	
	public int getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getModel_id() {
		return model_id;
	}

	public void setModel_id(int model_id) {
		this.model_id = model_id;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getVehicle_uuid() {
		return vehicle_uuid;
	}

	public void setVehicle_uuid(String vehicle_uuid) {
		this.vehicle_uuid = vehicle_uuid;
	}

	public String getVehicle_name() {
		return vehicle_name;
	}

	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}

	public String getVehicle_image_key() {
		return vehicle_image_key;
	}

	public void setVehicle_image_key(String vehicle_image_key) {
		this.vehicle_image_key = vehicle_image_key;
	}

	public String getImg_bucket_name() {
		return img_bucket_name;
	}

	public void setImg_bucket_name(String img_bucket_name) {
		this.img_bucket_name = img_bucket_name;
	}

	public String getVehicle_hin() {
		return vehicle_hin;
	}

	public void setVehicle_hin(String vehicle_hin) {
		this.vehicle_hin = vehicle_hin;
	}

	public int getVehicle_length() {
		return vehicle_length;
	}

	public void setVehicle_length(int vehicle_length) {
		this.vehicle_length = vehicle_length;
	}

	public int getEngine_count() {
		return engine_count;
	}

	public void setEngine_count(int engine_count) {
		this.engine_count = engine_count;
	}

	public boolean isDefault_vehicle() {
		return default_vehicle;
	}

	public void setDefault_vehicle(boolean default_vehicle) {
		this.default_vehicle = default_vehicle;
	}

	public boolean isDoor_alarm_enable() {
		return door_alarm_enable;
	}

	public void setDoor_alarm_enable(boolean door_alarm_enable) {
		this.door_alarm_enable = door_alarm_enable;
	}

	public Timestamp getDoor_alarm_from() {
		return door_alarm_from;
	}

	public void setDoor_alarm_from(Timestamp door_alarm_from) {
		this.door_alarm_from = door_alarm_from;
	}

	public Timestamp getDoor_alarm_to() {
		return door_alarm_to;
	}

	public void setDoor_alarm_to(Timestamp door_alarm_to) {
		this.door_alarm_to = door_alarm_to;
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

	public Customer getCdObj() {
		return cdObj;
	}

	public void setCdObj(Customer cdObj) {
		this.cdObj = cdObj;
	}
	
	
	
	

}
