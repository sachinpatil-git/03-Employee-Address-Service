package com.sachin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sachin.dto.AddressDto;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeAddressController {
	@Value("${instance.name}")
	private String instanceName;

	@RequestMapping(value = "/address")
	public AddressDto getAddress() {
		return new AddressDto("Vinuta", "Bangalore", 560040, "Karnataka", "India");

	}

	@RequestMapping(value = "inst")
	public String getInstanceName() {
		return "name of the instance is " + instanceName;
	}

}
