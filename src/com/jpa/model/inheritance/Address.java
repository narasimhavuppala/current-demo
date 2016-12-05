package com.jpa.model.inheritance;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String streetNo;
	private String city;
	private int zipcode;
	
	public String getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	

}
