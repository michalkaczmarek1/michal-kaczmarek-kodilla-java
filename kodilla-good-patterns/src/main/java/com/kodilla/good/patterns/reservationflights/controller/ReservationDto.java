package com.kodilla.good.patterns.reservationflights.controller;

import com.kodilla.good.patterns.reservationflights.flight.Reservation;

public class ReservationDto {
    private Reservation reservation;
    private boolean isAvailable;

    public ReservationDto(Reservation reservation, boolean isAvailable) {
        this.reservation = reservation;
        this.isAvailable = isAvailable;
    }
}
