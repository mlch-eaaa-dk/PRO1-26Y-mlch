package y26;

public class GuessNumber {
    void main() {
        int number = (int) (Math.random() * 100) + 1;
        IO.println("SECRET random number is : " + number);
        IO.println();

        IO.println("Guess a number in 1..100");

        int guess = -1;
        while(guess != number) {
            IO.print("Your guess: ");
            guess = Integer.parseInt(IO.readln());

            if (guess == number) {
                IO.println("You guessed it! The number is " + number);
            } else if (guess > number) {
                IO.println("Your guess is too HIGH");
            } else {
                IO.println("Your guess is too LOW");
            }
        }
    }
}
