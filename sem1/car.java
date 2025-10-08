public class Car {

    private String model;

    private static int count = 0;

    public Car(String model) {
        this.model = model;

        count++;
    }

    public String getModel() {
        return model;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota");
        Car car2 = new Car("BMW");
        Car car3 = new Car("Audi");

        System.out.println("Създадени коли: " + Car.getCount());

        System.out.println("Модел на car1: " + car1.getModel());
        System.out.println("Модел на car2: " + car2.getModel());
        System.out.println("Модел на car3: " + car3.getModel());
    }
}