package org.example.shapes;

public class Cube extends Shape3D {
    double size;

    private Cube(double size, Shape base) {
        this.size = size;
        this.base = base;
    }

    public Cube(double size) {
        this(size, new Rectangle(size, size));
    }

    @Override
    public double calculateVolume() {
        return size * size * size;
    }

    @Override
    public Shape getBase() {
        return base;
    }

}
