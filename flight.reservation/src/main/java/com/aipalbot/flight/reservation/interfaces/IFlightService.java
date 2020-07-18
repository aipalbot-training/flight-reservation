package com.aipalbot.flight.reservation.interfaces;

import com.aipalbot.flight.reservation.models.Card;
import com.aipalbot.flight.reservation.models.Person;
import com.aipalbot.flight.reservation.models.Receipt;

public interface IFlightService {
	public Receipt bookFlight(Receipt p);
	public String reserveFlight(Person p, Card c);
}
