package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final RentRequest rentRequest) {
        Order order = orderService.createOrder(rentRequest.getIdOrder(), rentRequest.getDateOrder(), rentRequest.getProducts(), rentRequest.getUser());

        if(order != null) {
            informationService.sendMessage();
            orderRepository.save(order);
            return new OrderDto(rentRequest.getUser(), order);
        } else {
            return new OrderDto(rentRequest.getUser(), order);
        }

    }
}
