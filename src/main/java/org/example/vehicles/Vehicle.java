package org.example.vehicles;

public abstract class Vehicle {

    String make;
    String model;
    String speed;
    Engine engine;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void start() {
        engine.start();
    }

    public void drive() {

    }

    protected abstract void accelerate();

}
