package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaBase implements Pizza {

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(15.00);
    }
    @Override
    public String getDescription() {
        return "Pizza standard with tomato sauce";
    }
}
