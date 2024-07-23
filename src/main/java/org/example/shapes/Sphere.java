package org.example.shapes;

public class Sphere extends Shape3D {

    public Sphere (Circle base){
        this.base = base;
    }

    @Override
    public double calculateVolume() {
        return base.calculateArea() * Math.sqrt(base.calculateArea() / Math.PI) * 4 / 3;
    }

    @Override
    public Shape getBase() {
        return super.getBase();
    }

}
