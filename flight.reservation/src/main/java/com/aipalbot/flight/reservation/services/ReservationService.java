package com.aipalbot.flight.reservation.services;

import java.util.Map;

import com.aipalbot.flight.reservation.interfaces.IReservationService;
import com.aipalbot.flight.reservation.memorydb.FlightFactory;
import com.aipalbot.flight.reservation.models.Card;
import com.aipalbot.flight.reservation.models.Flight;
import com.aipalbot.flight.reservation.models.Passenger;
import com.aipalbot.flight.reservation.models.Person;
import com.aipalbot.flight.reservation.models.Pet;
import com.aipalbot.flight.reservation.models.Receipt;
import com.aipalbot.flight.reservation.models.Seat;

public class ReservationService implements IReservationService{

	private FlightFactory factory;
	public ReservationService(FlightFactory factory) {
		this.factory = factory;
	}
	
	@Override
	public Receipt prepareReservation(Person person, Card card) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger reserveSeat(Person person, Pet pet, String luggage, String flightName) {
		Flight flight = factory.createFlight(flightName);
		Passenger passenger = new Passenger();
		passenger.setPerson(person);
		passenger.setPet(pet);
		passenger.setLuggage(luggage);
		
		
		
		
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String showAvailableSeats(Flight flight) {
		//Iteration of Map
		Map<String, Seat> seats = flight.getSeats();
		//List of unassigened seats
		//concatenation of values == "F"+"A"
		String availableSeats=""; // immutable 
		
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<String, Seat> entry: flight.getSeats().entrySet()) {
			//each entry contains Key and Value, example, this will contain seatNo and Seat
			String key = entry.getKey();
			Seat seat = entry.getValue();
			if(seat.getPassenger()==null) {
				String val = seat.getSeatNo()+" "+ seat.getLocation().toString();
				sb.append(val);
			}
		}

		return null;
	}

	@Override
	public String showReservedSeats(Flight flight) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
