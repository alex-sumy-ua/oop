package org.example.shapes;

public class Circle extends Shape {

    public double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.shape = "Circle";
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}
