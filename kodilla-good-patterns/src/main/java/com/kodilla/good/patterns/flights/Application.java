package com.kodilla.good.patterns.flights;

import com.kodilla.good.patterns.flights.flightssearch.FlightService;
import com.kodilla.good.patterns.flights.flightssearch.SearchProcessor;

public class Application {
    public static void main(String[] args) {
        SearchProcessor searchProcessor = new SearchProcessor(new FlightService());
        searchProcessor.process("departure", "Warszawa");
    }
}
