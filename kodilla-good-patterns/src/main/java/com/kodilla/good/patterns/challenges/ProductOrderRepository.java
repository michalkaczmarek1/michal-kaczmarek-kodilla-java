package com.kodilla.good.patterns.challenges;

public class ProductOrderRepository implements OrderRepository {
    @Override
    public boolean save(Order order) {
        System.out.println("Order " + order.getId() + " " + "has been saved in DB");
        return true;
    }

    @Override
    public boolean delete(Order order) {
        System.out.println("Order has been deleted from DB");
        return true;
    }
}
