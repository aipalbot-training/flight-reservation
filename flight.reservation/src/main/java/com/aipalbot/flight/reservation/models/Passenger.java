package com.aipalbot.flight.reservation.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Passenger {
	private int id;
	private Person person;
	private Pet pet;
	private String luggage;
	private Seat seat;
	private Flight flight;
}
