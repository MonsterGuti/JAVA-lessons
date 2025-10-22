package lab_5.zoo_animals;

public class Parrot extends Animal implements Trainable {
    @Override
    public void sound() {
        System.out.println("Squawk!");
    }
    @Override
    public void performTrick() {
        System.out.println("Parrot says hello!");
    }
}
