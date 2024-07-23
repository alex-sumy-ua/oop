package org.example.vehicles;

import org.example.shapes.Shape;

public abstract class Vehicle {

    String make;
    String model;
    int speed;
    Engine engine;
    int topSpeed;
    Shape shape;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Vehicle(String make, String model, Shape shape) {
        this.make = make;
        this.model = model;
        this.shape = shape;
    }

    public void start() {
        engine.start();
    }

    public void drive() {
        if (engine.running && this.speed < this.topSpeed){
           accelerate();
        } else {
            System.out.println(make + " " + model + " is not running.");
        }
    }

    protected abstract void accelerate();

}
