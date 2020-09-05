package com.kodilla.good.patterns.food.controller;

import com.kodilla.good.patterns.food.producer.Producer;
import com.kodilla.good.patterns.food.producer.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        int idOrder = 1;
        LocalDate dateOrder = LocalDate.now();
        List<Product> products = new ArrayList<>();
        Producer producer = new Producer("GlutenFreeShop");

        products.add(new Product(5.6, "Pietruszka", 1.5));
        products.add(new Product(2.8, "Marchewka", 8.7));
        products.add(new Product(3.6, "Ziemniaki", 4.7));
        products.add(new Product(5.7, "Cebula", 3.4));
        products.add(new Product(4.6, "Pomidory", 2.7));
        products.add(new Product(44.6, "Test", 3.2));

        return new OrderRequest(idOrder, dateOrder, products, producer);
    }

}
