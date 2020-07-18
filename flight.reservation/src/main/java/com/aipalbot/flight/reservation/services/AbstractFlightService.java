package com.aipalbot.flight.reservation.services;

import com.aipalbot.flight.reservation.interfaces.IPaymentService;
import com.aipalbot.flight.reservation.models.Card;
import com.aipalbot.flight.reservation.models.Person;
import com.aipalbot.flight.reservation.models.Receipt;

public abstract class AbstractFlightService implements IPaymentService{
	@Override
	public boolean performDebit(Card card) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Receipt bookFlight(Receipt p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String reserveFlight(Person p, Card c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String reserveSeat(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Receipt prepareReservation(Person person, Card card) {
		// TODO Auto-generated method stub
		return null;
	}
}
