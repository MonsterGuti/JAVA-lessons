package lection_4;

public class Vehicle {
    private String brand;
    private String model;
    private int hp;
    private double price;

    public Vehicle(String brand, String model, int hp, double price) {
        this.brand = brand;
        this.model = model;
        this.hp = hp;
        this.price = price;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getHp() {
        return hp;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        String result = this.brand + " " + this.model + " " + this.hp + " " + this.price;
        return result;
    }
}
