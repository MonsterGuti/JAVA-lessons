package lection_4;

import javax.sound.midi.Track;

public class App {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("BMW", "1", 100, 5000.01);
        Vehicle vehicle2 = new Vehicle("Audi", "2", 103, 5020.01);
        Vehicle vehicle3 = new Vehicle("Mercedes", "3", 102, 5030.01);
        System.out.println(vehicle1.getBrand());
        vehicle1.setBrand("Mercedes");
        System.out.println(vehicle1.getBrand());

        System.out.println(vehicle1.toString());
        Vehicle vehicles[] = new Vehicle[5];
        vehicles[0] = vehicle1;
        vehicles[1] = vehicle2;
        vehicles[2] = vehicle3;

        Car car1 = new Car("BMW", "1", 100, 5000.02, true);
    }

    public void getBestCar(Vehicle[] vehicles) {
        Vehicle temp = vehicles[0];
        for(int i = 1; i < vehicles.length; i++) {
            if(vehicles[i].getPrice() > temp.getPrice()) {
                temp = vehicles[i];
            }
        }
        System.out.println(temp.toString());
    }
}
