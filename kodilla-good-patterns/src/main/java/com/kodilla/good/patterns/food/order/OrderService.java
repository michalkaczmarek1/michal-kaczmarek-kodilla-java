package com.kodilla.good.patterns.food.order;

public interface OrderService {
    Order getInfoOrder(Order order);

    boolean process(Order order);
}
