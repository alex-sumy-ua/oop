package org.example.vehicles;

import org.example.shapes.Circle;
import org.example.shapes.Shape;

public class Car extends Vehicle {

    public Car(String make, String model, boolean running,
               int horsePower, String fuelType) {
        super(make, model);
        this.engine = new CarEngine(horsePower, fuelType);
    }

    public Car(String make, String model, boolean running,
               int horsePower, String fuelType, Shape shape) {
        super(make, model);
        this.engine = new CarEngine(horsePower, fuelType);
        this.shape = shape;
    }

    @Override
    public void accelerate() {
        String message;
        if (this.shape == null)
            message = make + " " + model + " speed: ";
        else
            message = make + " " + model + " shape: " + shape.shape + " speed: ";
        double fuelMod = switch (this.engine.fuelType) {
            case "Unleaded" -> 1.12D;
            case "Leaded" -> 1.1D;
            case "Diesel" -> 1.15D;
            case "Hybrid" -> 1.2D;
            case "Electric" -> 2.2D;
            default -> throw new IllegalStateException("Unexpected value: " + this.engine.fuelType);
        };
        for (int i = 0 ; i < 10 ; i++) {
                System.out.println(message + String.format("%.2f", (engine.horsePower * fuelMod) * /*Math.exp*/(Math.sqrt(i)) / 2));
        }
    }

}
