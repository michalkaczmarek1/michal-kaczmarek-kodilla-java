package com.kodilla.good.patterns.reservationflights.flight;

public class FlightReservationRepository implements FlightRepository {
    @Override
    public boolean saveFlightReservation(Reservation reservation) {
        System.out.println("Reservation: " + reservation + " has been saved in DB");
        return false;
    }
}
