package com.kodilla.good.patterns.reservationflights.controller;

import com.kodilla.good.patterns.reservationflights.flight.AviationCompany;
import com.kodilla.good.patterns.reservationflights.flight.Flight;
import com.kodilla.good.patterns.reservationflights.user.User;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ReservationRequest {
    private int idRes;
    private LocalDateTime localDateTime;
    private User user;
    private int idFlight;
    private AviationCompany aviationCompany;
    private Map<Integer, Flight> flightsDay = new HashMap<>();

    public ReservationRequest(int idRes, LocalDateTime localDateTime, User user, int idFlight, AviationCompany aviationCompany, Map<Integer, Flight> flightsDay) {
        this.idRes = idRes;
        this.localDateTime = localDateTime;
        this.user = user;
        this.idFlight = idFlight;
        this.aviationCompany = aviationCompany;
        this.flightsDay = flightsDay;
    }

    public int getIdRes() {
        return idRes;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public User getUser() {
        return user;
    }

    public int getIdFlight() {
        return idFlight;
    }

    public AviationCompany getAviationCompany() {
        return aviationCompany;
    }

    public Map<Integer, Flight> getFlightsDay() {
        return flightsDay;
    }
}
