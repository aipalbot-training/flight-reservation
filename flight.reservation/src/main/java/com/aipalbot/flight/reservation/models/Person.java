package com.aipalbot.flight.reservation.models;

import lombok.Getter;

@Getter
public abstract class Person {
private String name;
private Address address; //composition

	public Person(String name, Address address) {
		this.name = name;
		this.address=address;
	}


}
