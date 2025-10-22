package lab_5.Employees_and_Contractors;

public class Manager implements Payable {
    private double monthlySalary;
    private double bonusPercent;

    public Manager(double monthlySalary, double bonusPercent) {
        this.monthlySalary = monthlySalary;
        this.bonusPercent = bonusPercent;
    }

    @Override
    public double calculatePay() {
        return monthlySalary + (monthlySalary * bonusPercent / 100);
    }
}
