package com.kodilla.good.patterns.food.controller;

import com.kodilla.good.patterns.food.order.Order;

public class OrderDto {
    private Order order;
    private boolean isRealized;

    public OrderDto(Order order, boolean isRealized) {
        this.order = order;
        this.isRealized = isRealized;
    }

    public Order getOrder() {
        return order;
    }

}
