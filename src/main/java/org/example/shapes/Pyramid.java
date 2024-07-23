package org.example.shapes;

public class Pyramid extends Shape3D {

    private double height;

    public Pyramid(Shape base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return base.calculateArea() * height / 3;
    }

    @Override
    public Shape getBase() {
        return super.getBase();
    }

}
