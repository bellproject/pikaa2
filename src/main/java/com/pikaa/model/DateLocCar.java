package com.pikaa.model;

import java.util.Date;

public class DateLocCar {

	private int dateId;
	private Date pickDate;
	private Date returnDate;
	private int locId;
	private int carId;
	public int getDateId() {
		return dateId;
	}
	public void setDateId(int dateId) {
		this.dateId = dateId;
	}
	public Date getPickDate() {
		return pickDate;
	}
	public void setPickDate(Date pickDate) {
		this.pickDate = pickDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public int getLocId() {
		return locId;
	}
	public void setLocId(int locId) {
		this.locId = locId;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	@Override
	public String toString() {
		return "DateLocCar [dateId=" + dateId + ", pickDate=" + pickDate
				+ ", returnDate=" + returnDate + ", locId=" + locId
				+ ", carId=" + carId + "]";
	}
	
	
}
