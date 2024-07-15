package com.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Strudent {

	private String name;
	private String id;

	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Strudent(String name, String id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	public Strudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Strudent [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	
	
}
