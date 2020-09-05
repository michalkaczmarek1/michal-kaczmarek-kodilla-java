package com.kodilla.good.patterns.food.controller;

import com.kodilla.good.patterns.food.producer.Producer;
import com.kodilla.good.patterns.food.producer.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderRequest {
    private int idOrder;
    private LocalDate dateOrder;
    private List<Product> products = new ArrayList<>();
    private Producer producer;

    public OrderRequest(int idOrder, LocalDate dateOrder, List<Product> products, Producer producer) {
        this.idOrder = idOrder;
        this.dateOrder = dateOrder;
        this.products = products;
        this.producer = producer;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public LocalDate getDateOrder() {
        return dateOrder;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Producer getProducer() {
        return producer;
    }
}
