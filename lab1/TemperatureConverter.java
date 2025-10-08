Validatorpackage lab1;

public class TemperatureConverter {
    public static final double KELVIN_OFFSET = 273.15;

    public static double toCelsius(double temperatureInKelvin) {
        return temperatureInKelvin - KELVIN_OFFSET;
    }

    public static double toFahrenheit(double temperatureInKelvin) {
        return (temperatureInKelvin - KELVIN_OFFSET) * 1.8 + 32;
    }

    public static void main(String[] args) {
        double kelvin = 300;
        double celsius = toCelsius(kelvin);
        double fahrenheit = toFahrenheit(kelvin);

        System.out.printf("Celsius: %.2f°C%n", celsius);
        System.out.printf("Fahrenheit: %.2f°F%n", fahrenheit);
    }
}
