package com.test.telecom.obj;

public class NumberService {

	private String numberIdentifier;
	
	public String getNumberIdentifier() {
		return numberIdentifier;
	}

	public void setNumberIdentifier(String numberIdentifier) {
		this.numberIdentifier = numberIdentifier;
	}

	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	private PhoneNumber phoneNumber;
	
	private Customer customer;
	
}