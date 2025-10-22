package lab_5.Employees_and_Contractors;

public class Contractor implements Payable{
    private double money_per_hour;
    private int hours;

    public Contractor(double money_per_hour, int hours) {
        this.money_per_hour = money_per_hour;
        this.hours = hours;
    }
    @Override
    public double calculatePay() {
        return money_per_hour * hours;
    }
}
