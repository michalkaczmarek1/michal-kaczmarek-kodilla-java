package com.kodilla.good.patterns.reservationflights.flight;

import java.time.LocalDateTime;

public class Flight {
    private int id;
    private LocalDateTime localDateTime;
    private String departureAirport;
    private String arrivalAirport;
    private AviationCompany aviationCompany;
    private boolean isAvailable;

    public Flight(int id, LocalDateTime localDateTime, String departureAirport, String arrivalAirport, AviationCompany aviationCompany, boolean isAvailable) {
        this.id = id;
        this.localDateTime = localDateTime;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.aviationCompany = aviationCompany;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }

    public AviationCompany getAviationCompany() {
        return aviationCompany;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        return id == flight.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", localDateTime=" + localDateTime +
                ", departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", aviationCompany=" + aviationCompany +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
