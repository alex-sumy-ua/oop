package org.example.vehicles;

public class Car extends Vehicle {

    boolean hasSidecar;

    public Car(String make, String model, boolean running,
                      int horsePower, String fuelType) {
        super(make, model);
        this.engine = new CarEngine(running, horsePower, fuelType);

    }

    @Override
    protected void accelerate() {

    }
}
