package ex1;

/*
 Input purchased amount,
 calculate nad print sales tax (6%).
 */
public class SalesTax {
     void main() {
        // Algorithm:
        // Prompt user for purchased amount
        // Read purchased amount
        // Compute sales tax (6% of amount)
        // Print sales tax

        int taxPct = 6;

        IO.print("Purchased amount: ");
        double amount = Double.parseDouble(IO.readln());

        double tax = amount * taxPct / 100.0;

        IO.println("Sales tax is " + tax);
    }
}
