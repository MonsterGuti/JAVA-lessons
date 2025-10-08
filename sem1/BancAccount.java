public class BankAccount {

    private String owner;
    private double balance;

    public static final double INTEREST_RATE = 0.02;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public double calculateInterest(double amount) {
        return amount * INTEREST_RATE;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Martin Gogulanov", 1000.0);

        System.out.println("Owner: " + account.getOwner());
        System.out.println("Balance: " + account.getBalance() + " lv");

        double interest = account.calculateInterest(500.0);
        System.out.println("Interest on 500.0 BGN\n: " + interest + " lv");
    }
}
