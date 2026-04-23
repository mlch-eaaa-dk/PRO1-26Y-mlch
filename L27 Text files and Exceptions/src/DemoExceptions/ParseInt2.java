package DemoExceptions;

import java.util.Scanner;

// exception in getInt(); caught in main()
public class ParseInt2 {
    void main() {
        try {
            int num = readInt();
            IO.println(num);
        } catch (Exception ex) {
            IO.println("Sorry. Unexpected internal error.");
            // ex.printStackTrace();
        }
    }

    public int readInt() {
        try (Scanner scanner = new Scanner(System.in)) {
            IO.print("Type an integer: ");
            String strNumber = scanner.nextLine();
            return Integer.parseInt(strNumber);
        }
    }
}
