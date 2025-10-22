package SU2.InterfaceMeasurable;

public class SpeedSensor implements Measurable {
    double speed;
    public SpeedSensor(double s) {
        speed = s;
    }
    public double measure() {
        return speed;
    }
}
