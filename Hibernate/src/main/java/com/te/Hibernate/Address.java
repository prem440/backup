package com.te.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	private int survey_no;
	@Override
	public String toString() {
		return "Address [survey_no=" + survey_no + ", house_name=" + house_name + ", city=" + city + ", landmark="
				+ landmark + ", pincode=" + pincode + "]";
	}
	private String house_name;
	private String city;
	private String landmark;
	private int pincode;
	public int getSurvey_no() {
		return survey_no;
	}
	public void setSurvey_no(int survey_no) {
		this.survey_no = survey_no;
	}
	public String getHouse_name() {
		return house_name;
	}
	public void setHouse_name(String house_name) {
		this.house_name = house_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	

}
