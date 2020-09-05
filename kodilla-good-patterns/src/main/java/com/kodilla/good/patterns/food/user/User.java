package com.kodilla.good.patterns.food.user;

import com.kodilla.good.patterns.food.order.Order;
import com.kodilla.good.patterns.food.producer.Producer;
import com.kodilla.good.patterns.food.producer.Product;

import java.time.LocalDate;
import java.util.List;

public class User implements UserService {
    private String username;
    private String realName;

    public User(String username, String realName) {
        this.username = username;
        this.realName = realName;
    }

    @Override
    public Order createOrder(int idOrder, LocalDate dateOrder, List<Product> products, Producer producer) {
        return new Order(idOrder, dateOrder, products, producer);
    }
}
