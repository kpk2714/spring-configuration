package com.spring.withoutxml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	@Value("Chhatna")
	private String city;
	
	@Value("Bankura")
	private String district;
	
	@Value("West Bengal")
	private String state;
	
	@Value("722132")
	private String pincode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public Address(String city, String district, String state, String pincode) {
		super();
		this.city = city;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", district=" + district + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
}
