package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicOrderPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        //When
        BigDecimal cost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(15), cost);
    }

    @Test
    public void testBasicOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Cook basic pizza with tomatoes sauce and cheese", description);
    }

    @Test
    public void testBasicOrderPizzaWithExtraCheeseAndExtraGarlicSauceGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new ExtraGarlicSauceDecorator(theOrder);

        //When
        BigDecimal cost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(23), cost);
    }

    @Test
    public void testBasicOrderPizzaWithExtraChilliAndExtraOnionGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraChilliDecorator(theOrder);
        theOrder = new ExtraOnionDecorator(theOrder);

        //When
        BigDecimal cost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal("20.5"), cost);
    }

    @Test
    public void testBasicOrderPizzaWithExtraCheeseAndExtraGarlicSauceGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new ExtraGarlicSauceDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Cook basic pizza with tomatoes sauce and cheese + extra cheese + extra garlic sauce", description);
    }

    @Test
    public void testBasicOrderPizzaWithExtraChilliAndExtraOnionGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraChilliDecorator(theOrder);
        theOrder = new ExtraOnionDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Cook basic pizza with tomatoes sauce and cheese + extra chilli + extra onion", description);
    }

}
