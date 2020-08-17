package com.kodilla.testing.shape;

public class Circle implements Shape {

    private String name;
    private double radius;
    private double pi = 3.14;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    public double getPi() {
        return pi;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return pi*(radius * radius);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.radius, radius) != 0) return false;
        if (Double.compare(circle.pi, pi) != 0) return false;
        return name.equals(circle.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(pi);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
