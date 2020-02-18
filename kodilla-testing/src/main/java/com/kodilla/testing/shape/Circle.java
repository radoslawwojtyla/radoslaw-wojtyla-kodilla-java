package com.kodilla.testing.shape;

public class Circle implements Shape  {
    String shape;
    int radius;

    public Circle(String shape, int radius) {
        this.shape = shape;
        this.radius = radius;
    }

    public String getShape() {
        return shape;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;

        Circle circle = (Circle) o;

        if (getRadius() != circle.getRadius()) return false;
        return getShape().equals(circle.getShape());
    }

    @Override
    public int hashCode() {
        int result = getShape().hashCode();
        result = 31 * result + getRadius();
        return result;
    }

    @Override
    public String getShapeName(String shape) {
        return shape;
    }

    @Override
    public double getField() {
        return Math.PI * Math.pow(radius,radius);
    }
}
