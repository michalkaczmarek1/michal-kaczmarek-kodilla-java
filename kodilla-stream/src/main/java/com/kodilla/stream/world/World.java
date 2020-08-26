package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continents = new ArrayList<>();

    public World() {
        continents.add(new Continent("Europe"));
        continents.add(new Continent("Asia"));
        continents.add(new Continent("Africa"));
        continents.add(new Continent("North America"));
        continents.add(new Continent("South America"));
        continents.add(new Continent("Australia"));
        continents.add(new Continent("Antarctica"));
    }

    public List<Continent> getContinents() {
        return continents;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal totalPeople = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        return totalPeople;
    }
}
