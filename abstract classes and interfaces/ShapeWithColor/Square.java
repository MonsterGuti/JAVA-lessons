package lab_5.ShapeWithColor;

public class Square extends Shape {
    private double a;
    public Square(String color, double a) {
        super(color);
        this.a = a;
    }
    @Override
    public double getArea() {
        return a * a;
    }
    @Override
    public double getPerimeter() {
        return a * 4;
    }

}
