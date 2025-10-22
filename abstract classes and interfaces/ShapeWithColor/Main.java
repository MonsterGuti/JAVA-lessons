package lab_5.ShapeWithColor;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Triangle("Red", 3, 4, 5),
                new Square("Blue", 6)
        };
        for (Shape shape : shapes) {
            System.out.println("Color: " + shape.getColor());
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println();
        }
    }
}
