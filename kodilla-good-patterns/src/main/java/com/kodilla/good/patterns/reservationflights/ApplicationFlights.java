package com.kodilla.good.patterns.reservationflights;

import com.kodilla.good.patterns.reservationflights.controller.ReservationRequest;
import com.kodilla.good.patterns.reservationflights.controller.ReservationRequestRetriever;
import com.kodilla.good.patterns.reservationflights.flight.FlightReservationRepository;
import com.kodilla.good.patterns.reservationflights.flight.Flights;
import com.kodilla.good.patterns.reservationflights.flight.ReservationProcessor;
import com.kodilla.good.patterns.reservationflights.message.SmsService;
import com.kodilla.good.patterns.reservationflights.user.User;

public class ApplicationFlights {
    public static void main(String[] args) {
        ReservationRequestRetriever reservationRequestRetriever = new ReservationRequestRetriever();
        ReservationRequest reservationRequest = reservationRequestRetriever.retrieve();

        ReservationProcessor reservationProcessor = new ReservationProcessor(
                new Flights(),
                new User("michal88", "Michal Kaczmarek"),
                new FlightReservationRepository(),
                new SmsService()
        );

        reservationProcessor.process(reservationRequest);
    }
}
