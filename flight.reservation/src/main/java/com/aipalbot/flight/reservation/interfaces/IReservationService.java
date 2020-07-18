package com.aipalbot.flight.reservation.interfaces;

import com.aipalbot.flight.reservation.models.Card;
import com.aipalbot.flight.reservation.models.Person;
import com.aipalbot.flight.reservation.models.Receipt;

public interface IReservationService {

	public String reserveSeat(Person person);
	public Receipt prepareReservation(Person person, Card card);
	
}
