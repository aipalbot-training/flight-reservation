package com.aipalbot.flight.reservation.models;

import com.aipalbot.flight.reservation.utils.Location;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seat {
private int seatNo;
private Location location;
}
