package SU2.EmployeeswithBonus;

public class Intern extends Worker {
    public Intern(String name, double baseSalary) {
        super(name, baseSalary);
    }
    public double calculateTotalPay() {
        return baseSalary;
    }
}

