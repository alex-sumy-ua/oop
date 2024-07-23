package org.example.vehicles;

public class MotorcycleEngine extends Engine {

    public MotorcycleEngine(boolean running, int horsePower, String fuelType) {
        super(running, horsePower, fuelType);
        this.running = running;
        this.horsePower = horsePower;
        this.fuelType = fuelType;
    }
}
