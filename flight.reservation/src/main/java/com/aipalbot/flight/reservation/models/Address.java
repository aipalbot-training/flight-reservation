package com.aipalbot.flight.reservation.models;

import com.aipalbot.flight.reservation.utils.State;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Address {
	public String street;
	public String city;
	public int zipCode;
	public State state;	
}
