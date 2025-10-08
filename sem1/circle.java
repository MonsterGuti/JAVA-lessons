public class Circle {
    public static final double PI = 3.14;
    public double area;
    public double perimeter;

    public static double calculatePerimeter(double radius) {
        return 2 * PI * radius;
    }

    public static double calculateArea(double radius) {
        return PI * radius * radius;
    }
}

public static void main(String[] args) {
    double radius = 5;

    double area = Circle.calculateArea(radius);
    double perimeter = Circle.calculatePerimeter(radius);

    System.out.println("Area: " + area);
    System.out.println("Perimeter: " + perimeter);
}


