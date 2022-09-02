package com.test.telecom.obj;

import org.springframework.stereotype.Component;

@Component
public class PhoneNumber {

	private String number;
	
	private String status;
	
	public void setNumber(String number) {
		this.number = number;
	}

	public void setPhoneNumberStatus(String status) {
		this.status = status;
	}

	public String  getNumber() {
		return number;
	}
	
	public String  getStatus() {
		return status;
	}

}