package SU2.ShapeswithInterface;

public class Triangle implements Drawable {
    double base, height;
    public Triangle(double b, double h) {
        base = b;
        height = h;
    }
    public void draw() {
        System.out.println("Drawing a triangle.");
    }
}
