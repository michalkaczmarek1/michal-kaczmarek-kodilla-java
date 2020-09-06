package com.kodilla.good.patterns.reservationflights.flight;

import com.kodilla.good.patterns.reservationflights.user.User;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Reservation {
    private int idRes;
    private LocalDateTime localDateTime;
    private User user;
    private int idFlight;
    private AviationCompany aviationCompany;
    private Map<Integer, Flight> flightsDay = new HashMap<>();

    public Reservation(int idRes, LocalDateTime localDateTime, User user, int idFlight, AviationCompany aviationCompany, Map<Integer, Flight> flightsDay) {
        this.idRes = idRes;
        this.localDateTime = localDateTime;
        this.user = user;
        this.idFlight = idFlight;
        this.aviationCompany = aviationCompany;
        this.flightsDay = flightsDay;
    }

    public User getUser() {
        return user;
    }

    public int getIdFlight() {
        return idFlight;
    }

    public Map<Integer, Flight> getFlightsDay() {
        return flightsDay;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "idRes=" + idRes +
                ", localDateTime=" + localDateTime +
                ", user=" + user +
                ", idFlight=" + idFlight +
                ", aviationCompany=" + aviationCompany +
                ", flightsDay=" + flightsDay +
                '}';
    }
}
