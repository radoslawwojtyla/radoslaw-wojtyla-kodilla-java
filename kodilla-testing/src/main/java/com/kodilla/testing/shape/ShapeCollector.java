package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    public Shape shape;
    ArrayList<Shape> shapeList = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapeList.remove(shape);
    }

    public Shape getFigure(int n) {
        if (n < shapeList.size() && n >= 0) {
            return shapeList.get(n);
        } else {
            return null;
        }
    }

    public ArrayList<Shape> showFigures() {
        for (Shape elements : shapeList) {
            System.out.println(elements);
        }
        return shapeList;
    }
}
