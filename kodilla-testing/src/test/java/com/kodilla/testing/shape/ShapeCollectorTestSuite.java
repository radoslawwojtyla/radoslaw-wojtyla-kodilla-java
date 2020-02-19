package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAll() {
        System.out.println("The testing is started.");
    }

    @AfterClass
    public static void afterAll() {
        System.out.println("The tests are finished");
    }

    @Before
    public void beforeEvery() {
        testCounter++;
        System.out.println("Test no. " + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        Shape circle = new Circle("Circle", 4);
        ShapeCollector sampleShape = new ShapeCollector();
        //When
        sampleShape.addFigure(circle);
        //Then
        Assert.assertEquals(circle, sampleShape.getFigure(0));
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Shape square = new Square("Square", 3);
        Shape triangle = new Triangle("Triangle", 3, 4);
        ShapeCollector sampleShape = new ShapeCollector();
        //When
        sampleShape.addFigure(square);
        sampleShape.addFigure(triangle);
        sampleShape.removeFigure(square);
        //Then
        Assert.assertEquals(triangle, sampleShape.getFigure(0));
    }

    @Test
    public void testGetFigure() {
        //Given
        Shape triangle = new Triangle("Triangle", 3, 4);
        ShapeCollector sampleShape = new ShapeCollector();
        sampleShape.addFigure(triangle);
        //When
        Shape triangleToCompare;
        triangleToCompare = sampleShape.getFigure(0);
        //Then
        Assert.assertEquals(triangle, triangleToCompare);
    }
}