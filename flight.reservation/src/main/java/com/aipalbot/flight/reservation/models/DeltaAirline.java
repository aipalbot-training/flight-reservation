package com.aipalbot.flight.reservation.models;

import lombok.Getter;

@Getter
public class DeltaAirline extends Flight {
	
	private double discount;
	
	public DeltaAirline(double d) {
		discount=d;
	}
	
}
