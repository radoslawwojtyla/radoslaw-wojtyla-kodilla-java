package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class IngredientSalami extends AbstractPizzaDecorator {
    public IngredientSalami(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(4));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", salami";
    }
}
