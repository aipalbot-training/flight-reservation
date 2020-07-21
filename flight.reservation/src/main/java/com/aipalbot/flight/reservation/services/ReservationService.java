package com.aipalbot.flight.reservation.services;

import com.aipalbot.flight.reservation.interfaces.IReservationService;
import com.aipalbot.flight.reservation.models.Card;
import com.aipalbot.flight.reservation.models.Passenger;
import com.aipalbot.flight.reservation.models.Person;
import com.aipalbot.flight.reservation.models.Pet;
import com.aipalbot.flight.reservation.models.Receipt;

public class ReservationService implements IReservationService{


	@Override
	public Receipt prepareReservation(Person person, Card card) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger reserveSeat(Person person, Pet pet, String luggage, String flightName) {
		// TODO Auto-generated method stub
		return null;
	}

}
