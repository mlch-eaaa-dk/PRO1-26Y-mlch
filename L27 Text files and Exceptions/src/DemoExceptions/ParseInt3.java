package DemoExceptions;

import java.util.Scanner;

// exception in getInt() and in main; both caught in main
public class ParseInt3 {
	void main() {
		try {
			int num = getInt();
			IO.println("num = " + num);
			int a = 12 / num;
			IO.println("a = " +a);
		} catch (NumberFormatException ex) {
			IO.println("Not a number");
		} catch (ArithmeticException ex) {
			IO.println("Error: Division by zero.");
		}

		IO.println("SLUT");
	}

	public int getInt() {
		try (Scanner scanner = new Scanner(System.in)) {
			IO.print("Type an integer: ");
			String strNumber = scanner.nextLine();
			int n = Integer.parseInt(strNumber);
			return n;
		}
	}
}
