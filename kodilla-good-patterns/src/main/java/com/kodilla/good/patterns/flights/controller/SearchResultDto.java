package com.kodilla.good.patterns.flights.controller;

import com.kodilla.good.patterns.flights.flightssearch.Flight;

import java.util.Set;

public class SearchResultDto {
    private Set<Flight> flightsSearched;
    private boolean isSearched;

    public SearchResultDto(Set<Flight> flightsSearched, boolean isSearched) {
        this.flightsSearched = flightsSearched;
        this.isSearched = isSearched;
    }
}
