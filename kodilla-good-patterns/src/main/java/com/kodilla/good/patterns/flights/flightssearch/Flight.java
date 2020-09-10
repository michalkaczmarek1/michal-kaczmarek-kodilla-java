package com.kodilla.good.patterns.flights.flightssearch;

import java.time.LocalDateTime;

public final class Flight {
    private final int idFlight;
    private final LocalDateTime timeDeparture;
    private final LocalDateTime timeArrival;
    private final String airportDeparture;
    private final String airportArrival;
    private final String otherCity;


    public Flight(int idFlight, final LocalDateTime timeDeparture, final LocalDateTime timeArrival, final String airportDeparture, final String airportArrival, final String otherCity) {
        this.idFlight = idFlight;
        this.timeDeparture = timeDeparture;
        this.timeArrival = timeArrival;
        this.airportDeparture = airportDeparture;
        this.airportArrival = airportArrival;
        this.otherCity = otherCity;
    }

    public String getAirportDeparture() {
        return airportDeparture;
    }

    public String getAirportArrival() {
        return airportArrival;
    }

    public String getOtherCity() {
        return otherCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (idFlight != flight.idFlight) return false;
        if (!airportDeparture.equals(flight.airportDeparture)) return false;
        if (!airportArrival.equals(flight.airportArrival)) return false;
        return otherCity.equals(flight.otherCity);
    }

    @Override
    public int hashCode() {
        int result = idFlight;
        result = 31 * result + airportDeparture.hashCode();
        result = 31 * result + airportArrival.hashCode();
        result = 31 * result + otherCity.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "idFlight=" + idFlight +
                ", timeDeparture=" + timeDeparture +
                ", timeArrival=" + timeArrival +
                ", airportDeparture='" + airportDeparture + '\'' +
                ", airportArrival='" + airportArrival + '\'' +
                ", otherCity='" + otherCity + '\'' +
                '}';
    }
}
