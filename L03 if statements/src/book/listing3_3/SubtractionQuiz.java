package book.listing3_3;

public class SubtractionQuiz {
    void main() {
        // 1. Generate two random single-digit integers
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // 2. If number1 < number2, swap number1 with number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // 3. Prompt the student to answer "what is number1 - number2?"
        IO.print("What is " + number1 + " - " + number2 + "? ");
        int answer = Integer.parseInt(IO.readln());

        // 4. Grade the answer and display the result
        if (number1 - number2 == answer) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " - " + number2 +
                    " should be " + (number1 - number2)
            );
        }
    }
}