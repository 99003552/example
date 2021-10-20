package com.honda.ccsportal.entity;


import java.util.List;

public class Boat {
	private int boatLength;
	private String boatName;
	private String brand;
	private String model;
	private List<Engine> engine;
	private String hin;
	private String tcuNumber;
	private int telematicsProgramId;
	private String engineMake;
	
	public int getBoatLength() {
		return boatLength;
	}
	public void setBoatLength(int boatLength) {
		this.boatLength = boatLength;
	}
	public String getBoatName() {
		return boatName;
	}
	public void setBoatName(String boatName) {
		this.boatName = boatName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public List<Engine> getEngine() {
		return engine;
	}
	public void setEngine(List<Engine> engine) {
		this.engine = engine;
	}
	public String getHin() {
		return hin;
	}
	public void setHin(String hin) {
		this.hin = hin;
	}
	public String getTcuNumber() {
		return tcuNumber;
	}
	public void setTcuNumber(String tcuNumber) {
		this.tcuNumber = tcuNumber;
	}
	public int getTelematicsProgramId() {
		return telematicsProgramId;
	}
	public void setTelematicsProgramId(int telematicsProgramId) {
		this.telematicsProgramId = telematicsProgramId;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getEngineMake() {
		return engineMake;
	}
	public void setEngineMake(String engineMake) {
		this.engineMake = engineMake;
	}
}