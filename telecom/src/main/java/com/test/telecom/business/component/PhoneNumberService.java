package com.test.telecom.business.component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.telecom.configuration.PopulateTestData;
import com.test.telecom.obj.Customer;
import com.test.telecom.obj.NumberService;
import com.test.telecom.obj.PhoneNumber;



@Component
public class PhoneNumberService {

	@Autowired
	private PopulateTestData populateTestData;
	
	@Autowired
	private Customer customerObj;
	
	@Autowired
	private PhoneNumber phoneNumberObj;
	
	public List<PhoneNumber> getAllPhoneNumbers() 
		{
		try {
			List<PhoneNumber> listofNumbers = populateTestData.numberData().stream().map(o->o.getPhoneNumber()).collect(Collectors.toList());
			return listofNumbers;
		}catch(Exception e)
		{
			System.out.println("Error while fetching all telephone numbers"+e.getLocalizedMessage());
			return null;
		}
		}
		
	
	public List<PhoneNumber> getPhoneNumbersByCustomerID(String customerID) 
	{
		//Additional check as customer object can be null 
		try {
		List<PhoneNumber> listofNumbers = populateTestData.numberData().stream().filter(o -> Objects.nonNull(o.getCustomer())).filter(o->o.getCustomer().getCustomerID().toString().equals(customerID)).map(numobj->numobj.getPhoneNumber()).collect(Collectors.toList());
		return listofNumbers;
		}catch(Exception e)
		{
			System.out.println("Error while fetching number using customerID"+e.getLocalizedMessage());
			return null;
		}
	}
	
	
	public NumberService activatePhoneNumber(String customerID, String phoneNumber) 
	{
		try {
		List<NumberService> numberActivate = populateTestData.numberData().stream().filter(o->o.getPhoneNumber().getNumber().equals(phoneNumber)).collect(Collectors.toList());
		
		if(numberActivate.size() > 0 && numberActivate.get(0).getPhoneNumber().getStatus().toUpperCase().equals("INACTIVE"))
		{
			NumberService numberActivated=  numberActivate.get(0);
			customerObj.setCustomerID(customerID);
			
			phoneNumberObj = numberActivated.getPhoneNumber();
			phoneNumberObj.setPhoneNumberStatus("ACTIVE");		
			numberActivated.setCustomer(customerObj);
			numberActivated.setPhoneNumber(phoneNumberObj);
	
			return numberActivated;	
		}
		else
		{
			//Error number cannot be activated as may already be active or doesn't exist
			return null;
		}
		}catch(Exception e)
		{
			System.out.println("Error while activating number"+e.getLocalizedMessage());
			return null;
		}
	}

}
