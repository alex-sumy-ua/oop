package org.example.shapes;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
//        System.out.println("The area of the rectangle with length = " + length + " and  width = " + width + " : " + length * width);;
        return length * width;
    }

}
