package com.kodilla.good.patterns.reservationflights.message;

public class SmsService implements MessageService{
    @Override
    public boolean sendMessage() {
        System.out.println("Sms has been send");
        return true;
    }
}
