package lab_5.Employees_and_Contractors;

public class Main {
    public static void main(String[] args) {
        Payable[] payablePeople = new Payable[3];

        payablePeople[0] = new Manager(3000, 10);
        payablePeople[1] = new Contractor(25, 160);
        payablePeople[2] = new Manager(4500, 5);

        for (Payable person : payablePeople) {
            person.calculatePay();
        }
    }
}
