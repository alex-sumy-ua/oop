package org.example.vehicles;

public class Engine {

    boolean running;

    int horsePower;

    String fuelType;

    protected Engine(boolean running, int horsePower, String fuelType) {
        this.running = running;
        this.horsePower = horsePower;
        this.fuelType = fuelType;
    }

    public void start() {
        running = true;
    }
}
