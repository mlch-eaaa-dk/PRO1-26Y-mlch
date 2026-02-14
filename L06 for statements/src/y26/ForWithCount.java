package y26;

import java.util.Scanner;

public class ForWithCount {
    void main() {
        IO.println("Enter count of numbers:");
        int count = Integer.parseInt(IO.readln());

        IO.println("Enter " + count + " numbers in 1..99 on one line:");
        String input = IO.readln();
        Scanner scanner = new Scanner(input);

        int product = 1;
        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            product = product * number;
        }
        IO.println("product = " + product);
    }
}
