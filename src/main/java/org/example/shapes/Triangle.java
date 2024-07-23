package org.example.shapes;

public class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.shape = "Triangle";
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }

}
