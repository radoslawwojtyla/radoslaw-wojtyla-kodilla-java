package com.kodilla.patterns2.decorator.pizza;

//import org.junit.Test;
import com.kodilla.patterns2.decorator.taxiportal.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaWithMushroomsAndExtraCheese() {
        //Given
        Pizza pizza = new PizzaBase();
        pizza = new IngredientMushrooms(pizza);
        pizza = new IngredientExtraCheese(pizza);
        //When
        BigDecimal price = pizza.getPrice();
        String description = pizza.getDescription();
        //Then
        assertEquals(new BigDecimal(20), price);
        assertEquals("Pizza standard with tomato sauce, mushrooms, extra cheese", description);
    }

    @Test
    public void testPizzaAllIngredientsDoubleCheese() {
        //Given
        Pizza pizza = new PizzaBase();
        pizza = new IngredientSalami(pizza);
        pizza = new IngredientMushrooms(pizza);
        pizza = new IngredientExtraCheese(pizza);
        pizza = new IngredientExtraCheese(pizza);
        //When
        BigDecimal price = pizza.getPrice();
        String description = pizza.getDescription();
        //Then
        assertEquals(new BigDecimal(26), price);
        assertEquals("Pizza standard with tomato sauce, salami, mushrooms, extra cheese, extra cheese", description);
    }
}
