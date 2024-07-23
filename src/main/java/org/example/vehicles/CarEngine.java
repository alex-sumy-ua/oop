package org.example.vehicles;

public class CarEngine extends Engine {


    protected CarEngine(boolean running, int horsePower, String fuelType) {

        super(running, horsePower, fuelType);
        this.running = true;
        this.horsePower = 20;
        this.fuelType = "Diesel";

    }

}
