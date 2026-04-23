package DemoFiles.readnumbers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumbersApp {
	void main() {
		String reletivePath = "L27 Text files and Exceptions/src/DemoFiles/readnumbers/Numbers.txt";
		File in = new File(reletivePath);
		try (Scanner scanner = new Scanner(in)) {
			double sum = 0;
			while (scanner.hasNextDouble()) {
				double d = scanner.nextDouble();
				IO.println(d);
				scanner.nextLine();
				sum += d;
			}
			IO.println("Sum is " + sum);
		} catch (FileNotFoundException e) {
			IO.println("File not found!");
		}
	}
}
