package org.example.shapes;

public class Prism extends Shape3D {

    private double height;


    public Prism (Shape base, double height){
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
