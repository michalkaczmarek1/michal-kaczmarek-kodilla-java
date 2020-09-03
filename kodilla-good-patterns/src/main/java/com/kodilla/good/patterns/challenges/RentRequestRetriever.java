package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RentRequestRetriever {
    public RentRequest retrieve() {

        User user = new User("michal1988", "Michal Kaczmarek");
        int idOrder = 1;
        LocalDate dateOrder = LocalDate.now();

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "T-shirt", 20.0));
        products.add(new Product(2, "shoes", 5.0));
        products.add(new Product(3, "skirt", 78.5));

        return new RentRequest(user, dateOrder, idOrder, products);

    }
}
