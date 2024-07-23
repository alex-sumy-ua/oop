package org.example.shapes;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.shape = "Rectangle";
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

}
