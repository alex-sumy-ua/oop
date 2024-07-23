package org.example.shapes;

public class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
//        System.out.println("The area of the triangle with base = " + base + " and height = " + height + " : " + base * height / 2);;
        return base * height / 2;
    }

}
