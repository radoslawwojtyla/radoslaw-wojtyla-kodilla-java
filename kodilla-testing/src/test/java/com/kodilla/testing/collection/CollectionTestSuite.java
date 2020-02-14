package com.kodilla.testing.collection;
import org.junit.*;

import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Analiza przypadku testowego...");
    }
    @After
    public void after() {
        System.out.println("Zakonczenie analizy przypadku testowego" );
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Rozpoczecie analizy zbioru testow");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Zakonczenie analizy zbioru testow");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        ArrayList<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator emptyListTest = new OddNumbersExterminator();
        ArrayList<Integer> result = emptyListTest.getEven();
        Assert.assertEquals(emptyList, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(2);
        normalList.add(4);
        normalList.add(6);

        ArrayList<Integer> sampleList = new ArrayList<>();
        Random generator = new Random();
        for (int i=0; i<6; i++) {
            sampleList.add(i+1);
        }

        OddNumbersExterminator normalListTest = new OddNumbersExterminator(sampleList);
        ArrayList<Integer> result = normalListTest.getEven();
        Assert.assertEquals(normalList, result);
    }
}
