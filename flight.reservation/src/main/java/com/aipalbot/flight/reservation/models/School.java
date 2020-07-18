package com.aipalbot.flight.reservation.models;

import lombok.Getter;


@Getter
public class School {

	public String name;
	public Address address;
	
	public School(String name, Address address) {
		this.name = name;
		this.address=address;
	}	
}
