package com.kodilla.good.patterns.challenges;

public interface OrderRepository {

    boolean save(Order order);

    boolean delete(Order order);

}
