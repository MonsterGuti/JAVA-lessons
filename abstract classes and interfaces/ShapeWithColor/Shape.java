package lab_5.ShapeWithColor;

public abstract class Shape {
    protected String color;
    public Shape(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
