package com.aipalbot.flight.reservation.services;

import com.aipalbot.flight.reservation.interfaces.IPaymentService;
import com.aipalbot.flight.reservation.models.Card;
import com.aipalbot.flight.reservation.models.Flight;
import com.aipalbot.flight.reservation.models.Passenger;
import com.aipalbot.flight.reservation.models.Person;
import com.aipalbot.flight.reservation.models.Pet;
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
	public Receipt prepareReservation(Person person, Card card) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean verifyCar(Card card) {
		
		return false;
	}

	@Override
	public Passenger reserveSeat(Person person, Pet pet, String luggage, String flightName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String showAvailableSeats(Flight flight) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String showReservedSeats(Flight flight) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBalance(Card card, double money) {
		// TODO Auto-generated method stub		
	}
	
}
