package DemoFiles.writing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class WriteApp {
    void main() {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        String relativePath = "L27 Text files and Exceptions/src/DemoFiles/writing/Output.txt";
        File out = new File(relativePath);
        try (PrintWriter writer = new PrintWriter(out)
        ) {
            for (int number : numbers) {
                writer.println(number);
            }
        } catch (FileNotFoundException e) {
            IO.println(e.getMessage());
        }

        IO.println("End of program");
    }
}