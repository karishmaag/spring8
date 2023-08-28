package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bikedetail")
public class BikeModel {

	@Id
	private int bikeid;
	private String regnum;
	private String ownername;
	private int year;
	private String bikename;
	private String modename;
	public BikeModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BikeModel(int bikeid, String regnum, String ownername, int year, String bikename, String modename) {
		super();
		this.bikeid = bikeid;
		this.regnum = regnum;
		this.ownername = ownername;
		this.year = year;
		this.bikename = bikename;
		this.modename = modename;
	}
	public int getBikeid() {
		return bikeid;
	}
	public void setBikeid(int bikeid) {
		this.bikeid = bikeid;
	}
	public String getRegnum() {
		return regnum;
	}
	public void setRegnum(String regnum) {
		this.regnum = regnum;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getBikename() {
		return bikename;
	}
	public void setBikename(String bikename) {
		this.bikename = bikename;
	}
	public String getModename() {
		return modename;
	}
	public void setModename(String modename) {
		this.modename = modename;
	}
	
}
