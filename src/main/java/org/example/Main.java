package org.example;

import org.example.vehicles.*;
import org.example.shapes.*;
import java.util.List;


public class Main {

    public static void main(String[] args) {
/*        Car myCar = new Car("Toyota", "Prado", false, 160, "Diesel" );
        myCar.start();
        myCar.drive();
        myCar.accelerate();

        Motorcycle myMotorcycle = new Motorcycle("Suzuki", "SomeModel", false, 220, "Petrol", false);
        myMotorcycle.start();
        myMotorcycle.drive();
        myMotorcycle.accelerate();
*/
//**********************************************************

        List<Shape> shapes = List.of(
                new Circle(5),
                new Rectangle(2, 5),
                new Triangle(3, 7)
        );

        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + " area = " + shape.calculateArea());
        }


    }

}
