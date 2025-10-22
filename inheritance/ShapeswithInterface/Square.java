package SU2.ShapeswithInterface;

public class Square implements Drawable {
    double side;
    public Square(double s) {
        side = s;
    }
    public void draw() {
        System.out.println("Drawing a square.");
    }
}
