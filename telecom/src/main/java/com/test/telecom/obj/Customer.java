package com.test.telecom.obj;

import org.springframework.stereotype.Component;

// Customer Object class
@Component
public class Customer {
	private String customerID;

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	
}
