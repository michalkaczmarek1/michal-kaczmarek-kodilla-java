package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraGarlicSauceDecorator extends AbstractPizzaOrderDecoration{
    public ExtraGarlicSauceDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + extra garlic sauce";
    }
}
