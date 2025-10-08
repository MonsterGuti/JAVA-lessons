package lab1;

import java.util.Scanner;

public class CurrencyConverter {
    public static final double USD_TO_EUR = 0.92;
    public static final double EUR_TO_BGN = 1.96;

    public static double convertUsdToEur(double USD) {
        return USD * USD_TO_EUR;
    }

    public static double convertUsdToBgn(double USD) {
        return USD * EUR_TO_BGN;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number between 0 and 1: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(convertUsdToEur(a));
        System.out.println(convertUsdToEur(b));
        System.out.println(convertUsdToBgn(a));
        System.out.println(convertUsdToBgn(b));
    }
}
