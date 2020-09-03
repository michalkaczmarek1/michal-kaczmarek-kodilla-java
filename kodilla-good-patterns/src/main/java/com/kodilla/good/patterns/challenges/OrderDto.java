package com.kodilla.good.patterns.challenges;

public class OrderDto {
    private User user;
    private Order order;

    public OrderDto(User user, Order order) {
        this.user = user;
        this.order = order;
    }

    public User getUser() {
        return user;
    }

    public Order getOrder() {
        return order;
    }
}
