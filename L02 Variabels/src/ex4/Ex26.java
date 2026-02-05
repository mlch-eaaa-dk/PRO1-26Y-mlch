package ex4;

public class Ex26 {
    void main() {
        IO.println("Enter an integer in 0..999: ");
        int number = Integer.parseInt(IO.readln());
        
        int digit = number % 10;
        int product = digit;

        number = number / 10;
        if (number > 0) {
            digit = number % 10;
            product = product * digit;
        }

        number = number / 10;
        if (number > 0) {
            digit = number % 10;
            product = product * digit;
        }

        IO.println("The product of the digits is " + product);
    }
}
