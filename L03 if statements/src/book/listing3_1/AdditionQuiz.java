package book.listing3_1;

public class AdditionQuiz {
    void main() {
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 10 % 10);

        IO.print("What is " + number1 + " + " + number2 + "? ");

        int answer = Integer.parseInt(IO.readln());

        IO.println(number1 + " + " + number2 + " = " + answer + " is " +
                        (number1 + number2 == answer)
        );
    }
}
 