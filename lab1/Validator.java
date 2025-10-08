package lab1;

public class Validator {

    static class Point {
        double x;
        double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    public static boolean areCollinear(Point p1, Point p2, Point p3) {
        double left = (p2.y - p1.y) * (p3.x - p1.x);
        double right = (p3.y - p1.y) * (p2.x - p1.x);

        return Math.abs(left - right) < 1e-9;
    }

    public static void main(String[] args) {
        Point a = new Point(1, 2);
        Point b = new Point(2, 4);
        Point c = new Point(3, 6);

        if (areCollinear(a, b, c)) {
            System.out.println("Точките лежат на една права.");
        } else {
            System.out.println("Точките не лежат на една права.");
        }
    }
}
