package y26;

import java.util.Arrays;

public class DemoArrays {
	void main() {
		// create an array to contain 10 integers
		// all integers are initialized to 0
		int[] numbers = new int[10];
		
		// print the values in the array
		IO.print("(1) ");
		IO.println(Arrays.toString(numbers));
		IO.println();

		// fill the array with new values
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i * 10;
		}
		IO.print("(2) ");
		IO.println(Arrays.toString(numbers));
		IO.println();

		// read value at index 5
		int x = numbers[5];
		IO.print("(3) ");
		IO.println("Value at index 5: " + x);
		IO.println();

		// set value at index 5
		numbers[5] = 55;
		IO.print("(4) ");
		IO.println("New value at index 5: " + numbers[5]);
		IO.println();

		// print the indices
		IO.print("(5) ");
		IO.print("Indices: ");
		for (int i = 0; i < numbers.length; i++) {
			IO.print(String.format("%5d", i));
		}
		IO.println();
		// print the values
		IO.print("(6) ");
		IO.print("Values:  ");
		for (int i = 0; i < numbers.length; i++) {
			IO.print(String.format("%5d", numbers[i]));
		}
		IO.println();
		IO.println();

		// add 5 to each value
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers[i] + 5;
		}
		IO.print("(7) ");
		IO.println(Arrays.toString(numbers));
		IO.println();

		// easy initialization of an array with known values
		int[] evens = { 2, 4, 6, 8, 10 };
		IO.print("(8) ");
		IO.println(Arrays.toString(evens));
		IO.println();

		// ---------------------------------------------------------------------
		IO.println("-----------------");
		IO.println();

		// create an array to contain 6 strings
		// all strings are initialized to null
		// (null means no value)
		String[] names = new String[6];
		IO.print("(9) ");
		IO.println(Arrays.toString(names));
		IO.println();

		// fill the array partially and print
		names[0] = "John";
		names[1] = "Poul";
		names[2] = "George";
		names[3] = "Ringo";
		IO.print("(10) ");
		IO.println(Arrays.toString(names));
		IO.println();

		// print only the used entries
		IO.print("(11) ");
		int size = 4;
		for (int i = 0; i < size; i++) {
			IO.print(names[i] + "  ");
		}
		IO.println();
		IO.println();

		// add a new value at the of the used entries and print the array
		names[size] = "Brian";
		size++;
		IO.print("(12) ");
		IO.println(Arrays.toString(names));
		IO.println();

		// print only the used entries
		IO.print("(13) ");
		for (int i = 0; i < size; i++) {
			IO.print(names[i] + "  ");
		}
		IO.println();
	}
}
