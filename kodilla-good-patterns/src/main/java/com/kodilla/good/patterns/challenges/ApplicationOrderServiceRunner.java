package com.kodilla.good.patterns.challenges;

public class ApplicationOrderServiceRunner {
    public static void main(String[] args) {
        RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
        RentRequest rentRequest = rentRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(
                new SmsService(),
                new ProductOrderService(),
                new ProductOrderRepository()
        );

        orderProcessor.process(rentRequest);
    }
}
