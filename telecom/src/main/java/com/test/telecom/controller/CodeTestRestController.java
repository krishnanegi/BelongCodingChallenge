package com.test.telecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.telecom.business.component.PhoneNumberService;
import com.test.telecom.obj.Customer;
import com.test.telecom.obj.NumberService;
import com.test.telecom.obj.PhoneNumber;

@RestController
@RequestMapping
public class CodeTestRestController {


@Autowired
private PhoneNumberService phoneNumService;


	@GetMapping("/phoneNumbers")
	public List<PhoneNumber> getPhoneNumbers() {
		List<PhoneNumber> phoneNumbers = phoneNumService.getAllPhoneNumbers();
		return phoneNumbers;
	}
	
	@GetMapping("/phoneNumbers/{customerID}")
	public List<PhoneNumber> getPhoneNumbersByCustomerID(@PathVariable String customerID) {
		List<PhoneNumber> phoneNumbers = phoneNumService.getPhoneNumbersByCustomerID(customerID);
		return phoneNumbers;
	}
	
	@PostMapping("/phoneNumbers/activateService/{numberIdentifier}")
	public NumberService activateService(@RequestBody Customer customer, @PathVariable String numberIdentifier) {
		NumberService activatedService = phoneNumService.activatePhoneNumber(customer.getCustomerID(), numberIdentifier);
		return activatedService;
	}
	
}
