package com.kodilla.testing.shape;

public class Triangle implements Shape {
    String shape;
    int base;
    int height;

    public Triangle(String shape, int base, int height) {
        this.shape = shape;
        this.base = base;
        this.height = height;
    }

    public String getShape() {
        return shape;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

        if (getBase() != triangle.getBase()) return false;
        if (getHeight() != triangle.getHeight()) return false;
        return getShape().equals(triangle.getShape());
    }

    @Override
    public int hashCode() {
        int result = getShape().hashCode();
        result = 31 * result + getBase();
        result = 31 * result + getHeight();
        return result;
    }

    @Override
    public String getShapeName(String shape) {
        return shape;
    }

    @Override
    public double getField() {
        return base * height % 2;
    }
}
