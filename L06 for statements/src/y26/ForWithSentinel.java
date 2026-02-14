package y26;

import java.util.Scanner;

public class ForWithSentinel {
    void main() {
        IO.println("Enter some numbers in 1..99 on one line (end with 0):");
        Scanner scanner = new Scanner(IO.readln());

        int product = 1;
        int number = scanner.nextInt();
        while (number != 0) {
            product = product * number;
            number = scanner.nextInt();
        }
        IO.println("product = " + product);
    }
}
