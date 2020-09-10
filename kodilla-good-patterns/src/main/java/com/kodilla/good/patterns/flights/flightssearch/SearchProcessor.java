package com.kodilla.good.patterns.flights.flightssearch;

import com.kodilla.good.patterns.flights.controller.SearchResultDto;

import java.util.HashSet;
import java.util.Set;

public class SearchProcessor {
    public final static String DEPARTURE = "departure";
    public final static String ARRIVAL = "arrival";
    public final static String OTHERCITY = "other";

    private SearchService searchService;

    public SearchProcessor(SearchService searchService) {
        this.searchService = searchService;
    }

    public SearchResultDto process(String typeSearch, String keyWord) {
        if(typeSearch == DEPARTURE ) {
            Set<Flight> flightsDepartureCity = searchService.getFlightsByCity(keyWord);

            if(flightsDepartureCity.size() > 0 ) {
                System.out.println("Ilosc lotow z podanego miasta wynosi " + flightsDepartureCity.size());

                System.out.println("Lista lotów: ");
                flightsDepartureCity.forEach(System.out::println);

                return new SearchResultDto(flightsDepartureCity, true);
            } else {
                System.out.println("Brak lotów");
            }
        }

        if(typeSearch == ARRIVAL) {
            Set<Flight> flightsArrivalCity = searchService.getFlightsByArrivalCity(keyWord);

            if (flightsArrivalCity.size() > 0) {
                System.out.println("Ilosc lotow do danego miasta " + flightsArrivalCity.size());

                System.out.println("Lista lotów: ");
                flightsArrivalCity.forEach(System.out::println);

                return new SearchResultDto(flightsArrivalCity, true);
            } else {
                System.out.println("Brak lotów");
            }
        }

        if(typeSearch == OTHERCITY) {
            Set<Flight> flightsOtherCity = searchService.getFlightsByOtherCity(keyWord);

            if(flightsOtherCity.size() > 0) {
                System.out.println("Ilosc lotow przez podane miasto " + flightsOtherCity.size());

                System.out.println("Lista lotów: ");
                flightsOtherCity.forEach(System.out::println);

                return new SearchResultDto(flightsOtherCity, true);
            } else {
                System.out.println("Brak lotów");
            }
        }

        return new SearchResultDto(new HashSet<Flight>(), false);
    }
}
