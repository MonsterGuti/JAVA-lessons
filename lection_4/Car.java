package lection_4;

public class Car extends Vehicle {
    public boolean insurance;

    public Car(String brand, String model, int hp, double price, boolean insurance) {
        super(brand, model, hp, price);
        this.insurance = insurance;
    }
}
