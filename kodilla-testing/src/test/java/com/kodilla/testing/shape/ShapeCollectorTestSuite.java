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
        Shape circle = new Circle("Circle", 4);
        ShapeCollector sampleShape = new ShapeCollector();

        sampleShape.addFigure(circle);

        Assert.assertEquals(circle, sampleShape.getFigure(0));
    }

    @Test
    public void testRemoveFigure() {
        Shape square = new Square("Square", 3);
        Shape triangle = new Triangle("Triangle", 3, 4);
        ShapeCollector sampleShape = new ShapeCollector();

        sampleShape.addFigure(square);
        sampleShape.addFigure(triangle);
        sampleShape.removeFigure(square);

        Assert.assertEquals(triangle, sampleShape.getFigure(0));
    }

    @Test
    public void testGetFigure() {
        Shape triangle = new Triangle("Triangle", 3, 4);
        ShapeCollector sampleShape = new ShapeCollector();
        sampleShape.addFigure(triangle);

        Shape triangleToCompare;
        triangleToCompare = sampleShape.getFigure(0);

        Assert.assertEquals(triangle, triangleToCompare);
    }
}