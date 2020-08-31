package com.kodilla.exception.test;

public class SearchFlightRunner {
    public static void main(String[] args) {
        SearchFlight searchFlight = new SearchFlight();
        Flight flight1 = new Flight("Warsaw", "London");
        Flight flight2 = new Flight("New York", "Poznań");
        Flight flight3 = new Flight("Rio de Janeiro", "London");
        Flight flight4 = new Flight("Frankfurt", "Manchester");
        Flight flight5 = new Flight("Krakóœ", "New York");
        Flight flight6 = new Flight("Warsaw", "Berlin");

        try {
            searchFlight.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Some airports cannot available");
        }

    }
}
