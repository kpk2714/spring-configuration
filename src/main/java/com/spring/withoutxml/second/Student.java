package com.spring.withoutxml.second;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("Krishna Pada Kar")
	private String name;
	
	@Value("101")
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
//	public Student(String name, String id, Address address) {
//		super();
//		this.name = name;
//		this.id = id;
//		this.address = address;
//	}
	public Student(Address address) {
		super();
		this.address = address;
	}
	@Override
	public String toString() {
		return "Strudent [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
}
