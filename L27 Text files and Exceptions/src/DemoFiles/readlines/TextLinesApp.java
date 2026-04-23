package DemoFiles.readlines;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextLinesApp {
    void main() {
        // IO.println("User directory = " + System.getProperty("user.dir"));
        // Change relativePath to YOUR filepath
        String relativePath = "L27 Text files and Exceptions/src/DemoFiles/readlines/Test.txt"; // use "/" or "\\", not "\"
        File in = new File(relativePath);
        try (Scanner scanner = new Scanner(in)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                IO.println(line);
            }
            IO.println();
            IO.println("End of program");
        } catch (FileNotFoundException ex) {
            IO.println("Sorry! An unexpected error has occurred.");
            IO.println("Technical message: " + ex);
        }
    }
}
