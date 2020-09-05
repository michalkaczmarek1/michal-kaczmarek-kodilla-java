package com.kodilla.good.patterns.food.order;

import com.kodilla.good.patterns.food.controller.OrderDto;
import com.kodilla.good.patterns.food.controller.OrderRequest;
import com.kodilla.good.patterns.food.message.MessageService;
import com.kodilla.good.patterns.food.user.UserService;

public class OrderProcessor {
    private MessageService messageService;
    private OrderService orderService;
    private UserService userService;
    private OrderRepository orderRepository;

    public OrderProcessor(MessageService messageService, OrderService orderService, UserService userService, OrderRepository orderRepository) {
        this.messageService = messageService;
        this.orderService = orderService;
        this.userService = userService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(OrderRequest orderRequest) {
        Order order = userService.createOrder(
                orderRequest.getIdOrder(),
                orderRequest.getDateOrder(),
                orderRequest.getProducts(),
                orderRequest.getProducer()
        );

        boolean isRealized = orderService.process(order);

        if(isRealized) {
            messageService.sendMessage();
            orderRepository.saveOrder(order);
            return new OrderDto(order, isRealized);
        } else {
            return new OrderDto(order, isRealized);
        }

    }
}
