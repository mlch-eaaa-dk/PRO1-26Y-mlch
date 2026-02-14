package y26;

public class ForExample {
    void main() {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum = sum + i;
        }
        IO.println("Sum of even numbers in 1..100 is " + sum);
        // i out of scope here
        // IO.println(i); // ERROR!
    }
}
