package com.aipalbot.flight.reservation.memorydb;

import java.util.List;

import com.aipalbot.flight.reservation.models.DeltaAirline;
import com.aipalbot.flight.reservation.models.Flight;
import com.aipalbot.flight.reservation.models.Seat;
import com.aipalbot.flight.reservation.models.UnitedAirline;
import com.aipalbot.flight.reservation.utils.AirportCode;
import com.aipalbot.flight.reservation.utils.Color;
import com.aipalbot.flight.reservation.utils.FlightName;
import com.aipalbot.flight.reservation.utils.Terminal;
public class FlightFactory {

	public Flight createFlight(String flightName ) {
		
		if(flightName.equals(FlightName.DeltaAirline.toString())){
			
			double discount = 0.1; //10%
			Flight deltaAirline = new DeltaAirline(discount);
			deltaAirline.setColor(Color.Orange);
			deltaAirline.setArrival(AirportCode.JFK);
			deltaAirline.setFlightNo("DAL-1000");
			deltaAirline.setTerminal(Terminal.D);
			//set more properties
			
			return deltaAirline;
		}else if (flightName.equals(FlightName.UnitedAirline.toString())) {
			
			int promoCode = 2010;
			Flight unitedAirline = new UnitedAirline(promoCode);
			return unitedAirline;
			
		}else {
			return null;  // Exception -- Error handling, try and catch 
		}
		
	}
	
	public List<Seat> createSeats(String flight){
		
		return null;
	}
	
	
}
