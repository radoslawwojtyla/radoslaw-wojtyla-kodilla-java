package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class IngredientMushrooms extends AbstractPizzaDecorator {
    public IngredientMushrooms(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(3));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", mushrooms";
    }
}
