package com.kodilla.good.patterns.food.user;

import com.kodilla.good.patterns.food.order.Order;
import com.kodilla.good.patterns.food.producer.Producer;
import com.kodilla.good.patterns.food.producer.Product;

import java.time.LocalDate;
import java.util.List;

public interface UserService {
    Order createOrder(int idOrder, LocalDate dateOrder, List<Product> products, Producer producer);
}
