package org.example.vehicles;

public class Motorcycle extends Vehicle {

    protected boolean hasSidecar;

    protected Motorcycle(String make, String model, boolean running,
                      int horsePower, String fuelType, boolean hasSidecar) {
        super(make, model);
        this.engine = new MotorcycleEngine(running, horsePower, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    protected void accelerate() {

    }

}
