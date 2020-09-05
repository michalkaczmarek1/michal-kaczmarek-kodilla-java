package com.kodilla.good.patterns.food.producer;

import com.kodilla.good.patterns.food.order.Order;
import com.kodilla.good.patterns.food.order.OrderService;

public class Producer implements OrderService {
    private String name;

    public Producer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Order getInfoOrder(Order order) {
        return order;
    }

    @Override
    public String toString() {
        return "Producer{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean process(Order order) {
        if(order != null) {
            System.out.println("Ordered products: ");
            for (Product product: order.getProducts()){
                System.out.println(product);
            }
            System.out.println("Summary");
            System.out.println(getInfoOrder(order) + " has been realized by " + order.getProducer().getName());
            return true;
        }
        return false;
    }
}
