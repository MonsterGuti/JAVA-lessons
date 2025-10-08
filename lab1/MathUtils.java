Studentpackage lab1;

import java.util.Scanner;

public class MathUtils {
    public static void max(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else if (b > a) {
            System.out.println(b);
        }
    }

    public static void min(int a, int b) {
        if (a < b) {
            System.out.println(a);
        } else if (b < a) {
            System.out.println(b);
        }
    }
    public static void power(double a, double b) {
        double result = Math.pow(a, b);
        System.out.println(result);
    }
    static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        max(a, b);
        min(a, b);
        power(a, b);
        input.close();
    }
}
