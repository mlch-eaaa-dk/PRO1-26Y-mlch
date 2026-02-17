package y26;

import java.util.Scanner;

public class AboveAverage {
    void main() {
        // Make a program that inputs 10 numbers,
        // calculates the average,
        // and prints the numbers bigger than the average.

        // make an array that can contain 10 integer numbers
        int[] numbers = new int[10];

        System.out.println("Skriv 10 heltal på én linje:");
        Scanner scanner = new Scanner(IO.readln());
        // read the numbers into the numbers array
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // calculate the average
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += numbers[i];
        }
        double average = sum / 10.0;
        IO.println("average = " + average);

        // prints the numbers bigger than the average
        for (int i = 0; i < 10; i++) {
            if (numbers[i] > average) {
                IO.println(numbers[i]);
            }
        }
    }
}
