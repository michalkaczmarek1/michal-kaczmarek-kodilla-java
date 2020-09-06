package com.kodilla.good.patterns.reservationflights.flight;

import com.kodilla.good.patterns.reservationflights.controller.ReservationDto;
import com.kodilla.good.patterns.reservationflights.controller.ReservationRequest;
import com.kodilla.good.patterns.reservationflights.message.MessageService;
import com.kodilla.good.patterns.reservationflights.user.UserService;

public class ReservationProcessor {
    private FlightService flightService;
    private UserService userService;
    private FlightRepository flightRepository;
    private MessageService messageService;

    public ReservationProcessor(FlightService flightService, UserService userService, FlightRepository flightRepository, MessageService messageService) {
        this.flightService = flightService;
        this.userService = userService;
        this.flightRepository = flightRepository;
        this.messageService = messageService;
    }

    public ReservationDto process(ReservationRequest reservationRequest) {
        Reservation reservation = userService.createReservation(
                reservationRequest.getIdRes(),
                reservationRequest.getLocalDateTime(),
                reservationRequest.getUser(),
                reservationRequest.getIdFlight(),
                reservationRequest.getAviationCompany(),
                reservationRequest.getFlightsDay()
        );

        boolean isAvailable = userService.checkIsAvailable(reservation.getIdFlight(), reservation.getFlightsDay());
        ReservationDto reservationDto = new ReservationDto(reservation, isAvailable);

        if(isAvailable) {
            System.out.println("Reservation has been realized: " + reservation);
            flightRepository.saveFlightReservation(reservation);
            messageService.sendMessage();
            return reservationDto;
        } else {
            System.out.println("Flight: " + reservation + " is not available");
            return reservationDto;
        }
    }
}
