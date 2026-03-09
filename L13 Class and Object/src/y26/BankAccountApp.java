package y26;

public class BankAccountApp {
    void main() {
        BankAccount acc1 = new BankAccount("Jens");
        IO.println(acc1);

        acc1.deposit(1000);
        acc1.withDraw(300);
        acc1.withDraw(400);
        IO.println(acc1);
        IO.println();

        BankAccount acc2 = new BankAccount("Hans", 20000);
        IO.println(acc2);

        acc2.withDraw(2000);
        IO.println(acc2);
        IO.println();

        IO.println("nextId = "+ BankAccount.getNextId());
    }
}
