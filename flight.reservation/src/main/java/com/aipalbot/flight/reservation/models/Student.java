package com.aipalbot.flight.reservation.models;

import java.util.List;

import lombok.Getter;


@Getter
public class Student extends Person {
	public String id;
	public School school;
	public List<String> courseNames;
	public Student(String name, String id, School school, Address address) {
		super(name, address);		
		this.id = id;
		this.school=school;
	}

	
}
