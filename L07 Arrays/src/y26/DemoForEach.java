package y26;

public class DemoForEach {
    void main() {
        int[] t = {3, 6, 1, 4};

        int sum = 0;
        for (int i = 0; i < t.length; i++) { // for statement
            int value = t[i];
            sum += value;
        }
        IO.println("Sum med for sætning: " + sum);

        int sum1 = 0;
        for (int value : t) { // for-each statement
            sum1 += value;
        }
        IO.println("Sum med for-each sætning: " + sum1);
    }
}
