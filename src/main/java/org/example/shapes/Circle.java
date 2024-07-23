package org.example.shapes;

public class Circle extends Shape {

    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
//        System.out.println("The area of the circle with radius = " + radius + " : " + Math.PI * radius * radius);;
        return Math.PI * radius * radius;
    }
}
