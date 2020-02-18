package com.kodilla.testing.shape;

public class Square implements Shape {
    String shape;
    int height;

    public Square(String shape, int height) {
        this.shape = shape;
        this.height = height;
    }

    public String getShape() {
        return shape;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;

        Square square = (Square) o;

        if (getHeight() != square.getHeight()) return false;
        return getShape().equals(square.getShape());
    }

    @Override
    public int hashCode() {
        int result = getShape().hashCode();
        result = 31 * result + getHeight();
        return result;
    }

    @Override
    public String getShapeName(String shape) {
        return shape;
    }

    @Override
    public double getField() {
        return Math.pow(height,height);
    }
}
