package org.example.vehicles;

public class Motorcycle extends Vehicle {

    boolean hasSidecar;

    public Motorcycle(String make, String model, boolean running,
                      int horsePower, String fuelType, boolean hasSidecar) {
        super(make, model);
        this.engine = new MotorcycleEngine(running, horsePower, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    protected void accelerate() {

    }

}
