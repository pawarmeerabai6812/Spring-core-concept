package com.springCore.SpringCore0.Autowire.Anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	
	@Autowired
	@Qualifier("temp2")
	//@Qualifier("temp")
	private Address address;

	
//@Autowired
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
		
		System.out.println("Setting value");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside Constructor");
		
	}
	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}


}
