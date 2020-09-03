package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.List;

public class ProductOrderService implements OrderService{

    @Override
    public boolean cancelOrder() {
        System.out.println("Order has been canceled");
        return true;
    }

    @Override
    public Order createOrder(int id, LocalDate dateOrder, List<Product> products, User user) {
        return new Order(id, dateOrder, products, user);
    }


}
