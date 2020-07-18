package com.aipalbot.flight.reservation.models;

import lombok.Getter;


@Getter
public class Student extends Person {
	public String id;
	public School school;
	
	public Student(String name, String id, School school, Address address) {
		super(name, address);		
		this.id = id;
		this.school=school;
	}

}
