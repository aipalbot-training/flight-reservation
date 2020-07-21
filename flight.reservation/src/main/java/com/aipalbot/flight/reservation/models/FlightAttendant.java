package com.aipalbot.flight.reservation.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FlightAttendant extends Person{

private Flight flight;
private int id;
 
 public FlightAttendant(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
}
