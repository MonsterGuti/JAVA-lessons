package SU2.FoodandEatableInterface;

public class Bread extends Food implements Eatable{
    public Bread() {
        super("FoodAndEatable.Bread");
    }
    public void describe() {
        System.out.println("Baked from flour");
    }
    public void eat() {
        System.out.println("You eat the bread.");
    }

}

