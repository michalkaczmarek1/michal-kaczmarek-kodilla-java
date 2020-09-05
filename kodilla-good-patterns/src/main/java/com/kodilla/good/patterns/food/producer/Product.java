package com.kodilla.good.patterns.food.producer;

public class Product {
    private double price;
    private String name;
    private double amount;

    public Product(double price, String name, double amount) {
        this.price = price;
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
