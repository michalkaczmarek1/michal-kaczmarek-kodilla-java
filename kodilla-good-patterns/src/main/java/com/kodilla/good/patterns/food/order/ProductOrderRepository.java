package com.kodilla.good.patterns.food.order;

public class ProductOrderRepository implements OrderRepository{
    @Override
    public boolean saveOrder(Order order) {
        System.out.println("Order:  " + order + "  has been save in DB");
        return true;
    }
}
