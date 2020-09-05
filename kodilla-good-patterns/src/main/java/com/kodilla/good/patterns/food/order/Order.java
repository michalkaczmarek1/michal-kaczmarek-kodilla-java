package com.kodilla.good.patterns.food.order;

import com.kodilla.good.patterns.food.producer.Producer;
import com.kodilla.good.patterns.food.producer.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order  {
    private int id;
    private LocalDate dateOrder;
    private List<Product> products = new ArrayList<>();
    private Producer producer;

    public Order(int id, LocalDate dateOrder, List<Product> products, Producer producer) {
        this.id = id;
        this.dateOrder = dateOrder;
        this.products = products;
        this.producer = producer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Producer getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", dateOrder=" + dateOrder +
                ", products in cart=" + products.size() +
                ", producer=" + producer.getName() +
                '}';
    }

}
