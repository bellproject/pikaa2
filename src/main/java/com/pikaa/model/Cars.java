package com.pikaa.model;

public class Cars {
	
	private int carId;
	private String carType;
	private int carAvailability;
	private double carPrice;
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public int getCarAvailability() {
		return carAvailability;
	}
	public void setCarAvailability(int carAvailability) {
		this.carAvailability = carAvailability;
	}
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	@Override
	public String toString() {
		return "Cars [carId=" + carId + ", carType=" + carType
				+ ", carAvailability=" + carAvailability + ", carPrice="
				+ carPrice + "]";
	}
	
	

}
