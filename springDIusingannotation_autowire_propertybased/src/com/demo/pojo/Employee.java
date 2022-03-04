package com.demo.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	int id;
	private String name;
	private String email;
	// DEP INJ
	// using properties based
	@Autowired
	Address address;// has-a rel

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void EmployeeAddress() {
		// LOGIC
		address.setAddress1("block 204"); // set vals
		address.setCity("hyderabad");
		System.out.println(address.getAddress1());// get them
		System.out.println(address.getCity());
	}
}
