package y26;


/*
 * Input 3 numbers,
 * calculate and print the average of the numbers.
 */
public class ComputeAverage {
    void main() {
        // Algorithm:
        // Prompt the user for 3 integers
        // Read the 3 integers
        // Calculate average
        // Print average

        IO.println("Write 3 integers:");
        int integer1 = Integer.parseInt(IO.readln());
        int integer2 = Integer.parseInt(IO.readln());
        int integer3 = Integer.parseInt(IO.readln());

        double average = (integer1 + integer2 + integer3) / 3.0;

        IO.println("average = " + average);
    }
}
