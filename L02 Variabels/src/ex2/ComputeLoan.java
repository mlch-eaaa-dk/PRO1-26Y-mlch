package ex2;

/*
 Input loan amount, annual interest rate, and number of years,
 calculate and print monthly payment and total payment,

 Monthly payment = loan amount * interest rate / denominator,
 where denominator = 1 - 1 / (1 + interest rate pr month) ^ number of months).

 Use Math.pow(a, b) to calculate a ^ b (example: 2 ^ 3 = 8).
 */
public class ComputeLoan {
    void main() {
        // Algorithm:
        // Prompt user for loan amount
        // Read loan amount
        // Prompt user for yearly interest rate in %
        // Read yearly interest rate
        // Prompt user for number of years
        // Read number of years
        // Compute monthly payment
        // Display monthly payment
        // Compute total payment
        // Display total payment

        IO.print("Loan amount in $: ");
        double loanAmount = Double.parseDouble(IO.readln());
        IO.print("Number of years: ");
        int numberOfYears = Integer.parseInt(IO.readln());
        IO.print("Yearly Interest rate in %: ");
        double yearlyInterestRatePct = Double.parseDouble(IO.readln());
        double monthlyInterestRate = yearlyInterestRatePct/100/12;
        IO.println();

        int numberOfMonths = numberOfYears * 12;
        double denominator = 1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfMonths);
        double monthlyPayment = loanAmount * monthlyInterestRate / denominator;
        double totalPayment = monthlyPayment * numberOfYears * 12;

        IO.println(String.format("Monthly payment is %.2f", monthlyPayment));
        IO.println(String.format("Total payment is %.2f", totalPayment));
    }
}
