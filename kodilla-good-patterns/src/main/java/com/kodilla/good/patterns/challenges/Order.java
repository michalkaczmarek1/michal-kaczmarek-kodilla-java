package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private LocalDate dateOrder;
    private List<Product> products = new ArrayList<>();
    private User user;

    public Order(final int id, final LocalDate dateOrder, final List<Product> products, final User user) {
        this.id = id;
        this.dateOrder = dateOrder;
        this.products = products;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDateOrder() {
        return dateOrder;
    }

    public List<Product> getProducts() {
        return products;
    }

    public User getUser() {
        return user;
    }
}
