package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.List;

public interface OrderService {

    boolean cancelOrder();

    Order createOrder(int id, LocalDate dateOrder, List<Product> products, User user);

}
