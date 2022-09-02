package com.test.telecom.configuration;

import java.io.IOException;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.telecom.obj.NumberService;

@Configuration
public class PopulateTestData {

	public List<NumberService> numberData(){
	
	  ObjectMapper objectMapper = new ObjectMapper();
	try {
		List<NumberService> numberList = objectMapper.readValue(new ClassPathResource(
			      "telephoneNumber.json").getFile(), new TypeReference<List<NumberService>>(){});
		
		return numberList;
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	}
	
	}
		
}
