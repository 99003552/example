package com.honda.ccsportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private int customer_id;
	
	@Column(name = "hidas_id")
	private String hidas_id;
	
	@Column(name = "mobile_number")
	private String mobile_number;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "cust_image_key")
	private String cust_image_key;
	
	@Column(name = "cust_bucket_name")
	private String cust_bucket_name;
	
	@Column(name = "country_code")
	private String country_code;
	
	@Column(name = "created_by")
	private String created_by;
	
	@Column(name = "created_ts")
	private Timestamp created_ts;
	
	@Column(name = "updated_by")
	private String updated_by;

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getHidas_id() {
		return hidas_id;
	}

	public void setHidas_id(String hidas_id) {
		this.hidas_id = hidas_id;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCust_image_key() {
		return cust_image_key;
	}

	public void setCust_image_key(String cust_image_key) {
		this.cust_image_key = cust_image_key;
	}

	public String getCust_bucket_name() {
		return cust_bucket_name;
	}

	public void setCust_bucket_name(String cust_bucket_name) {
		this.cust_bucket_name = cust_bucket_name;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
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
	


}
