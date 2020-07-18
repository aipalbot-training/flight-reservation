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
}
