package com.aipalbot.flight.reservation.models;

import lombok.Getter;

@Getter
public class UnitedAirline extends Flight {

private int promotionCode;

	public UnitedAirline(int promoCode) {
		this.promotionCode = promoCode;
		
	}	
}
