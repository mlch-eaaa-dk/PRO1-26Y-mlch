package ex3;

public class Ex3 {
    void main() {
        IO.println("Enter 2 numbers: ");
        int number1 = Integer.parseInt(IO.readln());
        int number2 = Integer.parseInt(IO.readln());

        if (number1 <= number2) {
            IO.println(number1 + " <= " + number2);
        } else {
            IO.println(number2 + " < " + number1);
        }
    }
}
