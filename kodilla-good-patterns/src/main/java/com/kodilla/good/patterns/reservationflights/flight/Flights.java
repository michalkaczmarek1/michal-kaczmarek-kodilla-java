package com.kodilla.good.patterns.reservationflights.flight;

import java.util.HashMap;
import java.util.Map;

public class Flights implements FlightService{
    Map<Integer, Flight> flights = new HashMap<>();


    public Map<Integer, Flight> getFlights() {
        return new HashMap<>(flights);
    }

    @Override
    public boolean addFlight(Flight flight) {
        flights.put(flight.getId(), flight);
        return true;
    }
}
