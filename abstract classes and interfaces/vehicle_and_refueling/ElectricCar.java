package lab_5.vehicle_and_refueling;

public class ElectricCar extends Vehicle implements Refuelable{
    public  ElectricCar(String model) {
        super(model);
    }

    @Override
    public void move() {
        System.out.println(model + ": Electric car glides silently.");
    }
    @Override
    public void refuel() {
        System.out.println(model + ": Car charged at station.");
    }
}
