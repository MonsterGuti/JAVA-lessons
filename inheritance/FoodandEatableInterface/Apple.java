package SU2.FoodandEatableInterface;

public class Apple extends Food implements Eatable{
    public Apple() {
        super("FoodAndEatable.Apple");
    }
    public void describe() {
        System.out.println("A sweet red fruit");
    }
    public void eat() {
        System.out.println("You eat the apple.");
    }
}

