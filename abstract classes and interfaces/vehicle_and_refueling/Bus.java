package lab_5.vehicle_and_refueling;

public class Bus extends Vehicle {

    public Bus(String model) {
        super(model);
    }

    @Override
    public void move() {
        System.out.println(model + ": Bus is driving passengers.");
    }
}
