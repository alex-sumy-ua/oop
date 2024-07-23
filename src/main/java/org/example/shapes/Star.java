package org.example.shapes;

public class Star extends Shape {

        public double ray;
        public double thickness;

        public Star(double ray, double thickness) {
            this.ray = ray;
            this.thickness = thickness;
            this.shape = "Star";
        }

        @Override
        public double calculateArea() {
            return ray * thickness / 2 * 5;
        }

}
