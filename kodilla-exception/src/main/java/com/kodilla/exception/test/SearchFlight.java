package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlight {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warsaw", true);
        airports.put("Frankfurt", false);
        airports.put("Berlin", true);
        airports.put("Poznań", false);
        airports.put("Zagreb", true);
        airports.put("London", true);
        airports.put("New York", true);
        airports.put("Rio de Janeiro", true);
        airports.put("Kraków", true);
        airports.put("Manchester", false);

        if(airports.get(flight.getDepartureAirport()) && airports.get(flight.getArrivalAirport())){
            System.out.println("Flight is available");
            return true;
        } else {
            throw new RouteNotFoundException("Not found this route or airport is not available");
        }
    }
}
