package com.kodilla.good.patterns.reservationflights.controller;

import com.kodilla.good.patterns.reservationflights.flight.AviationCompany;
import com.kodilla.good.patterns.reservationflights.flight.Flight;
import com.kodilla.good.patterns.reservationflights.flight.Flights;
import com.kodilla.good.patterns.reservationflights.user.User;
import java.time.LocalDateTime;
import java.util.Map;

public class ReservationRequestRetriever {
    public ReservationRequest retrieve() {
        Flights flights = new Flights();
        flights.addFlight(new Flight(1, LocalDateTime.now(), "Warsaw", "Franfurt", new AviationCompany("LOT"), true));
        flights.addFlight(new Flight(2, LocalDateTime.now(), "Madrid", "Moscow", new AviationCompany("RyanAir"), true));
        flights.addFlight(new Flight(3, LocalDateTime.now(), "Warsaw", "Poznan", new AviationCompany("WizzAir"), true));
        flights.addFlight(new Flight(4, LocalDateTime.now(), "Wroclaw", "Franfurt", new AviationCompany("LOT"), false));
        flights.addFlight(new Flight(5, LocalDateTime.now(), "Warsaw", "Wieden", new AviationCompany("LOT"), true));
        Map<Integer, Flight> flightsDay = flights.getFlights();

        int idRes = 1;
        LocalDateTime dateRes = LocalDateTime.now();
        User user = new User("michal88", "Michal Kaczmarek");
        int idFlight = flightsDay.get(3).getId();
        AviationCompany aviationCompany = flightsDay.get(3).getAviationCompany();

        return new ReservationRequest(idRes, dateRes, user, idFlight, aviationCompany, flightsDay);
    }
}
