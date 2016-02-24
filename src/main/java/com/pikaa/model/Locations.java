package com.pikaa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="location")  
@Entity
public class Locations {
	
	@Id
	@Column(name="id")
	private int locId;
	@Column(name="name")
	private String locName;
	@Column(name="city")
	private String locCity;
	@Column(name="state")
	private String locState;
	@Column(name="zipcode")
	private int locZipcode;
	
	public int getLocId() {
		return locId;
	}
	public void setLocId(int locId) {
		this.locId = locId;
	}
	public String getLocName() {
		return locName;
	}
	public void setLocName(String locName) {
		this.locName = locName;
	}
	public String getLocCity() {
		return locCity;
	}
	public void setLocCity(String locCity) {
		this.locCity = locCity;
	}
	public String getLocState() {
		return locState;
	}
	public void setLocState(String locState) {
		this.locState = locState;
	}
	public int getLocZipcode() {
		return locZipcode;
	}
	public void setLocZipcode(int locZipcode) {
		this.locZipcode = locZipcode;
	}
	@Override
	public String toString() {
		return "Locations [locId=" + locId + ", locName=" + locName
				+ ", locCity=" + locCity + ", locState=" + locState
				+ ", locZipcode=" + locZipcode + "]";
	}
	
	

}
