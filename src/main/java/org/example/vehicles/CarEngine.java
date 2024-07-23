package org.example.vehicles;

public class CarEngine extends Engine {

    protected CarEngine() {
        super(false, 20, "Diesel");
    }

    public CarEngine(int horsePower, String fuelType) {
        super(false, horsePower, fuelType);
        this.horsePower = horsePower;
        this.fuelType = fuelType;

    }
}
