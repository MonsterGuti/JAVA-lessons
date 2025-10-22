package lab_5.vehicle_and_refueling;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Bus("Volvo B8R"),
                new ElectricCar("Tesla Model 3"),
                new Bus("Mercedes Citaro")
        };

        for (Vehicle v : vehicles) {
            v.move();
            v.stop();

            if (v instanceof Refuelable) {
                ((Refuelable) v).refuel();
            }
        }
    }
}
