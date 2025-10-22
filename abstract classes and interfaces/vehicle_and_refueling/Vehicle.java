package lab_5.vehicle_and_refueling;

public abstract class Vehicle {
    protected String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public abstract void move();

    public void stop() {
        System.out.println("Vehicle stopped.");
    }
}
