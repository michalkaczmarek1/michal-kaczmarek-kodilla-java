package com.kodilla.good.patterns.flights.flightssearch;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightService implements SearchService {
    private Set<Flight> flights = new HashSet<>();

    @Override
    public Set<Flight> getFlightsByCity(String city) {
        Set<Flight> flightsByCity = createDataBaseFlights().stream()
                .filter(flight -> flight.getAirportDeparture().equals(city))
                .collect(Collectors.toSet());
        return flightsByCity;
    }

    @Override
    public Set<Flight> getFlightsByArrivalCity(String city) {
        Set<Flight> flightsByArrivalCity = createDataBaseFlights().stream()
                .filter(flight -> flight.getAirportArrival().equals(city))
                .collect(Collectors.toSet());
        return flightsByArrivalCity;
    }

    @Override
    public Set<Flight> getFlightsByOtherCity(String city) {
        Set<Flight> flightsByOtherCity = createDataBaseFlights().stream()
                .filter(flight -> flight.getOtherCity().equals(city))
                .collect(Collectors.toSet());
        return flightsByOtherCity;
    }

    @Override
    public Set<Flight> createDataBaseFlights() {
        flights.add(new Flight(1,
                LocalDateTime.of(LocalDate.of(2020, 9, 1), LocalTime.of(10, 30)),
                LocalDateTime.of(LocalDate.of(2020, 9, 1), LocalTime.of(12, 30)),
                "Gdańsk",
                "Wrocław",
                "lack"));

        flights.add(new Flight(2,
                LocalDateTime.of(LocalDate.of(2020, 9, 2), LocalTime.of(12, 30)),
                LocalDateTime.of(LocalDate.of(2020, 9, 2), LocalTime.of(14, 30)),
                "Gdańsk",
                "Wrocław",
                "lack"));

        flights.add(new Flight(3,
                LocalDateTime.of(LocalDate.of(2020, 9, 2), LocalTime.of(16, 0)),
                LocalDateTime.of(LocalDate.of(2020, 9, 2), LocalTime.of(18, 0)),
                "Warszawa",
                "Wrocław",
                "Poznań"));

        flights.add(new Flight(4,
                LocalDateTime.of(LocalDate.of(2020, 9, 4), LocalTime.of(20, 30)),
                LocalDateTime.of(LocalDate.of(2020, 9, 4), LocalTime.of(22, 30)),
                "Warszawa",
                "Wrocław",
                "Kraków"));

        flights.add(new Flight(5,
                LocalDateTime.of(LocalDate.of(2020, 9, 4), LocalTime.of(21, 30)),
                LocalDateTime.of(LocalDate.of(2020, 9, 4), LocalTime.of(23, 30)),
                "Gdańsk",
                "Poznań",
                "lack"));

        return flights;
    }

}
