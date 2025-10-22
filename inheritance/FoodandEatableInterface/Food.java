package SU2.FoodandEatableInterface;

public abstract class Food {
    String name;
    Food(String name) {
        this.name = name;
    }
    public abstract void describe();

}

