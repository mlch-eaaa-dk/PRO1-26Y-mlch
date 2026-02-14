package y26;

import java.util.Scanner;

public class WhileWithCount {
    void main() {
        IO.println("Enter count of numbers:");
        int count = Integer.parseInt(IO.readln());

        IO.println("Enter " + count + " numbers in 1..99 on one line:");
        String input = IO.readln();
        Scanner scanner = new Scanner(input);

        int product = 1;
        int i = 0;
        while (i < count) {
            int number = scanner.nextInt();
            product = product * number;
            i++;
        }
        IO.println("product = " + product);
    }
}
