package y26.DemoBankAccount;

public class BankAccount {
    private int number;
    private String ownerName;
    private double balance; // DKR

    public BankAccount(int number, String ownerName) {
//        this.number = number;
//        this.ownerName = ownerName;
//        this.balance = 0;
        this(number, ownerName, 0);
    }

    public BankAccount(int number, String ownerName, double initialBalance) {
        this.number = number;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void withDraw(double amount) {
        this.balance = this.balance - amount;
    }

    @Override
    public String toString() {
        return String.format("BankAccount(%d, %s, kr %.2f)",number, ownerName, balance);
    }
}
