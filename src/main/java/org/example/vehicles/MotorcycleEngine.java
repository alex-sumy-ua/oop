package org.example.vehicles;

public class MotorcycleEngine extends Engine {

    public MotorcycleEngine(boolean running, int horsePower, String fuelType) {
        super(running, horsePower, fuelType);
        this.running = true;
        this.horsePower = 10;
        this.fuelType = "Unleaded";
    }
}
