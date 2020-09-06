package com.kodilla.good.patterns.reservationflights.user;

import com.kodilla.good.patterns.reservationflights.flight.AviationCompany;
import com.kodilla.good.patterns.reservationflights.flight.Flight;
import com.kodilla.good.patterns.reservationflights.flight.Reservation;
import java.time.LocalDateTime;
import java.util.Map;

public interface UserService {
    Reservation createReservation(int id, LocalDateTime dateReservation, User user, int idFlight, AviationCompany aviationCompany, Map<Integer, Flight> flightsDay);

    boolean checkIsAvailable(int idFlight, Map<Integer, Flight> flightDays);
}
