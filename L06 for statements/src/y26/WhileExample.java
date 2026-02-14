package y26;

public class WhileExample {
    void main() {
        int sum = 0;
        int i = 2;
        while (i <= 100) {
            sum = sum + i;
            i += 2;
        }
        IO.println("Sum of even numbers in 1..100 is " + sum);
        // i in scope here
        // IO.println(i);
    }
}
