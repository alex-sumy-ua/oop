package org.example;

import org.example.shapes.*;
import java.util.ArrayList;
import java.util.List;
import org.example.vehicles.*;

public class Main {

    public static void main(String[] args) {

        // First part of the Sprint


        Car myCar = new Car("Toyota", "Prado", false, 160, "Hybrid" );
        myCar.start();
        myCar.drive();
        myCar.accelerate();

        Car myCar2 = new Car("Honda", "SR-V", false, 170, "Hybrid" , new Circle(2000));
        myCar2.start();
        myCar2.drive();
        myCar2.accelerate();

        Car myCar3 = new Car("Tesla", "Model-Z", false, 250, "Electric" , new Star(2000, 800));
        myCar3.start();
        myCar3.drive();
        myCar3.accelerate();

        Motorcycle myMotorcycle = new Motorcycle("Suzuki", "SomeModel", false, 220, "Petrol", false);
        myMotorcycle.start();
        myMotorcycle.drive();
        myMotorcycle.accelerate();

        Plane myPlane = new Plane("Junkers", "JF-45", false, 210, "Unleaded", 5000 );
        myPlane.start();
        myPlane.drive();
        myPlane.accelerate();


//**********************************************************

        // Second part of the Sprint

        // 2.1

/*        List<Shape> shapes = List.of(
                new Circle(5),
                new Rectangle(2, 5),
                new Triangle(3, 7)
        );

        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + " area = " + shape.calculateArea());
        }

        // 2.2

        List<Shape3D> shapes3d = new ArrayList<>(List.of(new Cube(5)));

        for (Shape shape : shapes) {

            if (shape instanceof Circle circle) {
                shapes3d.add(new Sphere(circle));
                shapes3d.add(new Cylinder(circle, 5));
                shapes3d.add(new Cone(circle, 5));
            }

            else {
                shapes3d.add(new Prism(shape, 5));
                shapes3d.add(new Pyramid(shape, 5));
            }

        }

        for (Shape3D shape3d : shapes3d) {
            System.out.println(shape3d.getClass().getSimpleName() + " with " +
                    shape3d.getBase().getClass().getSimpleName() + " base | Volume = " +
                    shape3d.calculateVolume());
        }
*/
    }

}
