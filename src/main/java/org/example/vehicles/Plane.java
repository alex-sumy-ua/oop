package org.example.vehicles;

public class Plane extends Vehicle {

    protected int topHeight;

    public Plane(String make, String model, boolean running,
               int horsePower, String fuelType, int topHeight) {
        super(make, model);
        this.engine = new CarEngine(horsePower, fuelType);
        this.topHeight = topHeight;
    }

    @Override
    public void accelerate() {
        String message = make + " " + model + " speed: ";
        double fuelMod = switch (this.engine.fuelType) {
            case "Unleaded" -> 1.12D;
            case "Leaded" -> 1.1D;
            case "Diesel" -> 1.15D;
            case "Hybrid" -> 1.2D;
            default -> throw new IllegalStateException("Unexpected value: " + this.engine.fuelType);
        };
        for (int i = 0 ; i < 10 ; i++) {
            System.out.println(message + String.format("%.2f", (engine.horsePower * fuelMod) * (Math.sqrt(i))));
        }
    }

}
