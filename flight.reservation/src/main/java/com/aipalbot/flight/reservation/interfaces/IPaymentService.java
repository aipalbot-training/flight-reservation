package com.aipalbot.flight.reservation.interfaces;

import com.aipalbot.flight.reservation.models.Card;

public interface IPaymentService extends IFlightService, IReservationService {
	boolean performDebit(Card card);	
	void updateBalance(Card card, double money);
	boolean verifyCar(Card card);
	
}
