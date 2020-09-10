package com.kodilla.good.patterns.flights.flightssearch;

import java.util.Set;

public interface SearchService {
    Set<Flight> getFlightsByCity(String city);

    Set<Flight> getFlightsByArrivalCity(String city);

    Set<Flight> getFlightsByOtherCity(String city);

    Set<Flight> createDataBaseFlights();
}
