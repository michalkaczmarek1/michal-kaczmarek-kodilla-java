package com.kodilla.good.patterns.challenges;

public class SmsService implements InformationService {
    @Override
    public boolean sendMessage() {
        System.out.println("Sms has been send");
        return true;
    }
}
