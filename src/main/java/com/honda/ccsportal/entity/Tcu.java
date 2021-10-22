package com.honda.ccsportal.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tcu")
public class Tcu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tcu_id")
	private String tcu_id;

	@Column(name = "device_id",insertable=false,updatable=false)
	private int deviceId;

	@Column(name = "hardware_version")
	private int hardwareVerssion;

	@Column(name = "serial_number")
	private String serialNumber;

	@Column(name = "sim_iccid")
	private String simIccid;

	@Column(name = "firmware_last_updated")
	private Timestamp firmwareLastUpdate;

	@Column(name = "firmware_version")
	private String firmwareVerssion;

	@Column(name = "created_by")
	private String createNm;

	@Column(name = "created_ts")
	private Date createdDate;
	
	@Column(name = "tcu_status")
	private String tcuStatus;

	@OneToOne
	@JoinColumn(name="device_id")
	private VehicleDevice vdObj;
	
	public String getTcu_id() {
		return tcu_id;
	}

	public void setTcu_id(String tcu_id) {
		this.tcu_id = tcu_id;
	}

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public int getHardwareVerssion() {
		return hardwareVerssion;
	}

	public void setHardwareVerssion(int hardwareVerssion) {
		this.hardwareVerssion = hardwareVerssion;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getSimIccid() {
		return simIccid;
	}

	public void setSimIccid(String simIccid) {
		this.simIccid = simIccid;
	}

	public Timestamp getFirmwareLastUpdate() {
		return firmwareLastUpdate;
	}

	public void setFirmwareLastUpdate(Timestamp firmwareLastUpdate) {
		this.firmwareLastUpdate = firmwareLastUpdate;
	}

	public String getFirmwareVerssion() {
		return firmwareVerssion;
	}

	public void setFirmwareVerssion(String firmwareVerssion) {
		this.firmwareVerssion = firmwareVerssion;
	}

	public String getCreateNm() {
		return createNm;
	}

	public void setCreateNm(String createNm) {
		this.createNm = createNm;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getTcuStatus() {
		return tcuStatus;
	}

	public void setTcuStatus(String tcuStatus) {
		this.tcuStatus = tcuStatus;
	}

	public VehicleDevice getVdObj() {
		return vdObj;
	}

	public void setVdObj(VehicleDevice vdObj) {
		this.vdObj = vdObj;
	}

}
