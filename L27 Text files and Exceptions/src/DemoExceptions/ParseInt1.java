package DemoExceptions;

import java.util.Scanner;

// exception in main(); caught in main()
public class ParseInt1 {
    void main() {
        try (Scanner scanner = new Scanner(System.in)) {
            IO.print("Type an integer: ");
            String strNumber = scanner.nextLine();
            try {
                int n = Integer.parseInt(strNumber);
                IO.println(n);
            } catch (NumberFormatException ex) {
                IO.println("Error: Not an integer.");
                IO.println("Technical message: " + ex);
            }
            IO.println("Efter catch");
        }
    }
}
