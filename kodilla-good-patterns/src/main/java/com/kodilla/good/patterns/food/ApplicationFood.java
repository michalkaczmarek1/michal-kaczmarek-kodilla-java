package com.kodilla.good.patterns.food;

import com.kodilla.good.patterns.food.controller.OrderRequest;
import com.kodilla.good.patterns.food.controller.OrderRequestRetriever;
import com.kodilla.good.patterns.food.message.MailService;
import com.kodilla.good.patterns.food.order.OrderProcessor;
import com.kodilla.good.patterns.food.order.ProductOrderRepository;
import com.kodilla.good.patterns.food.producer.Producer;
import com.kodilla.good.patterns.food.user.User;

public class ApplicationFood {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        MailService mailService = new MailService();
        Producer producer = orderRequest.getProducer();
        User user = new User("michal88", "Michal Kaczmarek");
        ProductOrderRepository productOrderRepository = new ProductOrderRepository();

        OrderProcessor orderProcessor = new OrderProcessor(
                mailService,
                producer,
                user,
                productOrderRepository
        );

        orderProcessor.process(orderRequest);

    }
}
