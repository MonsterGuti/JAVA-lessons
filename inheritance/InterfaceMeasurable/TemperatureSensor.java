package SU2.InterfaceMeasurable;

public class TemperatureSensor implements Measurable {
    double temperature;
    public TemperatureSensor(double t) {
        temperature = t;
    }
    public double measure() {
        return temperature;
    }
}
