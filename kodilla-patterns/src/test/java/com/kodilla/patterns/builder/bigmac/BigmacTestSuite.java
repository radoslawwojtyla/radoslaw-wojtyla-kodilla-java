package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("salad")
                .bun("traditional")
                .sauce("mayonnaise")
                .ingredient("cheddar")
                .ingredient("bacon")
                .ingredient("cheddar")
                .ingredient("jalapeno")
                .build();
        System.out.println(bigmac);
        //When
        int ingredientsQuantity = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(ingredientsQuantity, 5);
    }
}
