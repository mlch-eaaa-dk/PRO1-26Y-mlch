package y26;

public class FizzBuzz {
    void main() {
        // Read a positive integer number.
        // Print “Fizz” if the number is divisible by 3,
        // print “Buzz” if the number is divisible by 5,
        // print “FizzBuzz” if the number is divisible by both 3 and 5,
        // otherwise just print the number.

        IO.print("Enter a positive number: ");
        int number = Integer.parseInt(IO.readln());

        boolean divBy3 = number % 3 == 0;
        boolean divBy5 = number % 5 == 0;

        if (divBy3 && divBy5) {
            System.out.println("FizzBuzz");
        } else if (divBy5) {
            System.out.println("Buzz");
        } else if (divBy3) {
            System.out.println("Fizz");
        } else {
            System.out.println("The number is " + number);
        }
    }
}
