package com.pikaa.model;

import java.util.Date;

public class ZipcodePage {
	
	private String zipcode;
	private int pickDateDay;
	private int pickDateMonth;
	private int pickDateYear;
	private int returnDateDay;
	private int returnDateMonth;
	private int returnDateYear;
	private String renterAge;
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public int getPickDateDay() {
		return pickDateDay;
	}
	public void setPickDateDay(int pickDateDay) {
		this.pickDateDay = pickDateDay;
	}
	public int getPickDateMonth() {
		return pickDateMonth;
	}
	public void setPickDateMonth(int pickDateMonth) {
		this.pickDateMonth = pickDateMonth;
	}
	public int getPickDateYear() {
		return pickDateYear;
	}
	public void setPickDateYear(int pickDateYear) {
		this.pickDateYear = pickDateYear;
	}
	public int getReturnDateDay() {
		return returnDateDay;
	}
	public void setReturnDateDay(int returnDateDay) {
		this.returnDateDay = returnDateDay;
	}
	public int getReturnDateMonth() {
		return returnDateMonth;
	}
	public void setReturnDateMonth(int returnDateMonth) {
		this.returnDateMonth = returnDateMonth;
	}
	public int getReturnDateYear() {
		return returnDateYear;
	}
	public void setReturnDateYear(int returnDateYear) {
		this.returnDateYear = returnDateYear;
	}
	public String getRenterAge() {
		return renterAge;
	}
	public void setRenterAge(String renterAge) {
		this.renterAge = renterAge;
	}
	@Override
	public String toString() {
		return "ZipcodePage [zipcode=" + zipcode + ", pickDateDay="
				+ pickDateDay + ", pickDateMonth=" + pickDateMonth
				+ ", pickDateYear=" + pickDateYear + ", returnDateDay="
				+ returnDateDay + ", returnDateMonth=" + returnDateMonth
				+ ", returnDateYear=" + returnDateYear + ", renterAge="
				+ renterAge + "]";
	}
	
	

}
