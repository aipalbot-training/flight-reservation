package com.aipalbot.flight.reservation.memorydb;

import java.util.HashMap;
import java.util.Map;

import com.aipalbot.flight.reservation.models.Passenger;

public class Data {

	public static Map<Integer,Passenger> reservationDB;
	
	public static void initializaData() {
		if(reservationDB==null)
		{
			reservationDB = new HashMap<>();
		}	
	}
}
