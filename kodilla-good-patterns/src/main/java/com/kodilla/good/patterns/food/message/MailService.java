package com.kodilla.good.patterns.food.message;

public class MailService implements MessageService {
    @Override
    public boolean sendMessage() {
        System.out.println("Order has been send.");
        return true;
    }
}
