package com.aipalbot.flight.reservation.models;

import lombok.Getter;


@Getter
public class School {

	private String name;
	private Address address;
	
	public School(String name, Address address) {
		this.name = name;
		this.address=address;
	}
	

//	public School prepareSchool(String name, String location) {
//		this.name = name;
//		Address a = new Address();
//		a.setStreet(location);
//		this.address = a;
//		
//		return this;
//	}
//	
//	public School prepareSchool(String name, Address location) {
//		this.name = name;		
//		this.address = location;		
//		return this;
//	}
//	
}
