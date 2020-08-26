package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();
        List<Continent> continentList = world.getContinents();
        continentList.get(0).addCountry(new Country("Poland", new BigDecimal("40000000")));
        continentList.get(0).addCountry(new Country("Spain", new BigDecimal("50000000")));
        continentList.get(1).addCountry(new Country("China", new BigDecimal("1140000000")));
        continentList.get(1).addCountry(new Country("India", new BigDecimal("1120000000")));
        continentList.get(2).addCountry(new Country("Senegal", new BigDecimal("20000000")));
        continentList.get(2).addCountry(new Country("Egipt", new BigDecimal("140000000")));
        continentList.get(3).addCountry(new Country("USA", new BigDecimal("320000000")));
        continentList.get(3).addCountry(new Country("Canada", new BigDecimal("10000000")));
        continentList.get(4).addCountry(new Country("Brazil", new BigDecimal("240000000")));
        continentList.get(4).addCountry(new Country("Argentina", new BigDecimal("20000000")));
        continentList.get(5).addCountry(new Country("Australia", new BigDecimal("20000000")));
        continentList.get(5).addCountry(new Country("New Zeland", new BigDecimal("5000000")));
        continentList.get(6).addCountry(new Country("Other", new BigDecimal("1000")));
        BigDecimal totalPeopleExpected = new BigDecimal("3125001000");

        //When
        BigDecimal resultTotalPeople = world.getPeopleQuantity();

        //Then
        assertEquals(totalPeopleExpected, resultTotalPeople);


    }
}
