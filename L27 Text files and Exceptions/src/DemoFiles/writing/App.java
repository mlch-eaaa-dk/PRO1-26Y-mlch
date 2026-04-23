package DemoFiles.writing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    void main() {
        String relativePath = "L27 Text files and Exceptions/src/DemoFiles/writing/Output.txt";
        File out = new File(relativePath);
        try (Scanner scanner = new Scanner(System.in);
             PrintWriter writer = new PrintWriter(out)
        ) {
            IO.println("Type some positive decimal numbers: (end with 0)");
            boolean finished = false;
            while (!finished) {
                double d = -1;
                try {
                    d = scanner.nextDouble();
                    if (d == 0) {
                        finished = true;
                    } else {
                        IO.println("Typed in: " + d);
                        writer.println(d);
                    }
                } catch (InputMismatchException ex) {
                    String token = scanner.next();
                    IO.println("NOT a decimal number: " + token);
                }
            }
        } catch (FileNotFoundException ex) {
            IO.println(ex.getMessage());
        }

        IO.println("End of program ");
    }
}
