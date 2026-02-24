package y26.DemoBankAccount;

public class BankAccountApp {

    void main() {
        BankAccount acc1 = new BankAccount(1001,"Jens Hansen");
        BankAccount acc2 = new BankAccount(1002, "Ulla Poulsen", 2000);
        IO.println("acc1 = " + acc1);
        IO.println("acc2 = " + acc2);
        IO.println();

        String owner1001 = acc1.getOwnerName();
        IO.println("acc1 - Navn: " + owner1001);

        double balance100 = acc1.getBalance();
        IO.println("acc2 - Balance: kr " + balance100);
        IO.println();

        IO.println("acc1 - Navn: " + acc2.getOwnerName());
        IO.println("acc2 - Balance: kr " + acc2.getBalance());
        IO.println();

        acc1.deposit(500);
        acc1.deposit(800);
        acc1.withDraw(1000);

        IO.println("acc1 - Balance: kr " + acc1.getBalance());
        IO.println();

        IO.println("acc1 = " +acc1);
        IO.println("acc2 = " +acc2);
    }
}
