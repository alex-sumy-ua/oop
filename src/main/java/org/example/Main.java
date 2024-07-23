package org.example.vehicles;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Prado", false, 160, "Diesel" );
        myCar.start();
        myCar.drive();
        myCar.accelerate();

        Motorcycle myMotorcycle = new Motorcycle("Suzuki", "SomeModel", false, 220, "Petrol", false);
        myMotorcycle.start();
        myMotorcycle.drive();
        myMotorcycle.accelerate();
    }

}
