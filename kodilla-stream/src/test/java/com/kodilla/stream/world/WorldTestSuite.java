package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        // Given
        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country spain = new Country("Spain", new BigDecimal("50000000"));
        Country usa = new Country("USA", new BigDecimal("330000000"));
        Country canada = new Country("Canada", new BigDecimal("36000000"));
        Country china = new Country("China", new BigDecimal("1385000000"));
        Country india = new Country("India", new BigDecimal("1300000000"));

        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(spain);

        Continent asia = new Continent("Asia");
        asia.addCountry(china);
        asia.addCountry(india);

        Continent northAmerica = new Continent ("North America");
        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(northAmerica);

        //When
        BigDecimal worldPopulation = world.getPeopleQuantity();

        //Then
        BigDecimal expectedValue = new BigDecimal("3139000000");
        Assert.assertEquals(expectedValue, worldPopulation);
    }
}
