package com.sachin.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddressDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("employeeName")
	private String employeeName;
	@JsonProperty("city")
	private String city;
	@JsonProperty("zipcode")
	private int zipcode;
	@JsonProperty("state")
	private String state;
	@JsonProperty("country")
	private String country;

	public AddressDto() {

	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public AddressDto(String employeeName, String city, int zipcode, String state, String country) {
		super();
		this.employeeName = employeeName;
		this.city = city;
		this.zipcode = zipcode;
		this.state = state;
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
