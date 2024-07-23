package org.example.shapes;

public class Cylinder extends Shape3D{

    private double height;

    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateVolume() {
        return 0;
    }

    @Override
    public Shape getBase() {
        return super.getBase();
    }

}
