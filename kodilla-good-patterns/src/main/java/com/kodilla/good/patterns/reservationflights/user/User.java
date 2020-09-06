package com.kodilla.good.patterns.reservationflights.user;

import com.kodilla.good.patterns.reservationflights.flight.AviationCompany;
import com.kodilla.good.patterns.reservationflights.flight.Flight;
import com.kodilla.good.patterns.reservationflights.flight.Reservation;
import java.time.LocalDateTime;
import java.util.Map;

public class User implements UserService {
    private String username;
    private String realName;

    public User(String username, String realName) {
        this.username = username;
        this.realName = realName;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }

    @Override
    public Reservation createReservation(int id, LocalDateTime dateReservation, User user, int idFlight, AviationCompany aviationCompany, Map<Integer, Flight> flightDays) {
        return new Reservation(id, dateReservation, user, idFlight, aviationCompany, flightDays);
    }

    public boolean checkIsAvailable(int idFlight, Map<Integer, Flight> flightDays) {
        for(Map.Entry<Integer, Flight> entry: flightDays.entrySet()) {
            if(entry.getKey() == idFlight && entry.getValue().isAvailable()) {
                return true;
            }
        }
        return false;
    }
}
