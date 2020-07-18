package com.aipalbot.flight.reservation.services;

import com.aipalbot.flight.reservation.interfaces.IFlightService;
import com.aipalbot.flight.reservation.interfaces.IReservationService;
import com.aipalbot.flight.reservation.models.Card;
import com.aipalbot.flight.reservation.models.Person;
import com.aipalbot.flight.reservation.models.Receipt;

public class FlightService implements IFlightService {

	public IReservationService rsv;
	
	public FlightService(IReservationService rsv) {
			this.rsv = rsv;
	}
	
	
	@Override
	public Receipt bookFlight(Receipt p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String reserveFlight(Person p, Card c) {

		this.rsv.prepareReservation(p, c);
		
		return null;
	}

}
