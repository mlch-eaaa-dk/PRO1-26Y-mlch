package DemoFiles.readnumbers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumbersApp1 {
    void main() {
        String relativePath = "L27 Text files and Exceptions/src/DemoFiles/readnumbers/Numbers.txt";
        File in = new File(relativePath);
        try (Scanner scanner = new Scanner(in)) {
            double sum = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                line = line.replaceAll(",", ".");
                IO.println(line);
                try {
                    double d = Double.parseDouble(line);
                    sum += d;
                } catch (NumberFormatException ex) {
                    IO.println("  Not a double.");
                }
            }
            IO.println("Sum is " + sum);
        } catch (FileNotFoundException ex) {
            IO.println("Sorry! An unexpected error has occurred.");
            IO.println("Technical message: " + ex.getMessage());
        }
    }

}
