package y26;

import java.util.Scanner;

public class WhileWithNextInt {
    void main() {
        IO.println("Enter some integers on one line:");
        String input = IO.readln();
        Scanner scanner = new Scanner(input);

        int product = 1;
        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            product = product * number;
        }
        IO.println("Product = " + product);
    }
}
