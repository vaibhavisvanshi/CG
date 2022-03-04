package com.demo.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	int id;
	private String name;
	private String email;
	Address address;// has-a rel

	/**
	 * @param address
	 */
	// DEP INJ
	//@Autowired
	public Employee(Address address) {

		System.out.println("using constructor");
		address.setAddress1("block 543"); // set vals
		address.setCity("pune");
		System.out.println(address.getAddress1());// get them
		System.out.println(address.getCity());
	}

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

	}
}
