package lab_5.zoo_animals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Tiger(),
                new Parrot()
        };
        for (Animal animal : animals) {
            if (animal instanceof Tiger) {
                ((Trainable) animal).performTrick();
            }
        }
    }
}
