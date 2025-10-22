package SU2.FoodandEatableInterface;

public class Cheese extends Food implements Eatable{
    public Cheese() {
        super("FoodAndEatable.Cheese");
    }
    public void describe() {
        System.out.println("Made from milk");
    }
    public void eat() {
        System.out.println("You eat the cheese.");
    }
}

