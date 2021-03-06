package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraOnionDecorator extends AbstractPizzaOrderDecoration{
    public ExtraOnionDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3.5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + extra onion";
    }
}
