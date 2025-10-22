package SU2.EmployeeswithBonus;

public abstract class Worker {
    String name;
    double baseSalary;
    Worker(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName(){
        return name;
    }
    public abstract double calculateTotalPay();
}

