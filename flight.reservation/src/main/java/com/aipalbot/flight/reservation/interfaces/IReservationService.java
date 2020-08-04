package com.aipalbot.flight.reservation.interfaces;

import com.aipalbot.flight.reservation.models.Card;
import com.aipalbot.flight.reservation.models.Flight;
import com.aipalbot.flight.reservation.models.Passenger;
import com.aipalbot.flight.reservation.models.Person;
import com.aipalbot.flight.reservation.models.Pet;
import com.aipalbot.flight.reservation.models.Receipt;


public interface IReservationService {

	public Passenger reserveSeat(Person person, Pet pet, String luggage, String flightName);
	public Receipt prepareReservation(Person person, Card card);
	public String showAvailableSeats(Flight flight);
	public String showReservedSeats(Flight flight);
	
}
