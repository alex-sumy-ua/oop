package org.example.shapes;

public class Cube extends Shape3D{

    double size;


    public Cube (double size) {
      this.size = size;
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
