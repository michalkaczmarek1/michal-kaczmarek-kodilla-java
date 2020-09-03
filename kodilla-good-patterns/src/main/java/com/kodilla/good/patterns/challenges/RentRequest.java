package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.List;

public class RentRequest {
    private User user;
    private LocalDate dateOrder;
    private int idOrder;
    private List<Product> products;

    public RentRequest(User user, LocalDate dateOrder, int idOrder, List<Product> products) {
        this.user = user;
        this.dateOrder = dateOrder;
        this.idOrder = idOrder;
        this.products = products;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getDateOrder() {
        return dateOrder;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public List<Product> getProducts() {
        return products;
    }
}
