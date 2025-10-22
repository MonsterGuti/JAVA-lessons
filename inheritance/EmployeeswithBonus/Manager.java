package SU2.EmployeeswithBonus;

public class Manager extends Worker {
    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }
    public double calculateTotalPay() {
        return baseSalary * 1.20;
    }
}
