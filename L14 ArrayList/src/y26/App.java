package y26;

import java.util.ArrayList;

public class App {
    void main() {
        ArrayList<String> names = new ArrayList<>();

        // add at the end
        names.add("Ib");
        names.add("Peter");
        names.add("Ulla");
        IO.print("(1) "); // (1)
        IO.println("names = " + names);
        IO.println();

        // add at index 1
        names.add(1, "Per");
        IO.print("(2) "); // (2)
        IO.println("names = " + names);
        IO.println();

        // read value at index 2
        String name1 = names.get(2);
        IO.print("(3) "); // (3)
        IO.println("Name at index 2: " + name1);
        IO.println();

        // remove value at index 3
        String name2 = names.remove(3);
        IO.print("(4) "); // (4)
        IO.println("Removed at index 3: " + name2);
        IO.println("names = " + names);
        IO.println();

        // replace value at index 0
        String replaced = names.set(0, "Jens");
        IO.print("(5) "); // (5)
        IO.println("Replaced at index 0: " + replaced);
        IO.println("names = " + names);
        IO.println();

        // get index of a value
        IO.print("(6) "); // (6)
        IO.println("Index of 'Peter': " + names.indexOf("Peter"));
        IO.println("Index of 'Mike': " + names.indexOf("Mike"));
        IO.println();

        // test for contains
        IO.print("(7) "); // (7)
        IO.println("Contains 'Per'? " + names.contains("Per"));
        IO.println("Contains 'Mike'? " + names.contains("Mike"));
        IO.println();

        // Traversing with for statement
        IO.print("(8) "); // (8)
        IO.println("Traversing with for statement:");
        for (int i = 0; i < names.size(); i++) {  // i er 0, 1, 2, 3, ...
            String name = names.get(i);  // value of name:  "Ib", "Per", "Jens", ...
            IO.println(i + ": " + name);
        }
        IO.println();

        // Traversing with for-each
        IO.print("(9) "); // (9)
        IO.println("Traversing with for-each statement:");
        for (String name : names) { // value of name: "Ib", "Per", "Jens", ...
            IO.println(name);
        }
        IO.println();

        // ---------------------------------------------------------------------
        IO.println("-----------");
        IO.println();

        // ArrayList can only contain objects, not primitive values.
        // Use wrapper classes for primitive types.

        //ArrayList<int> numbers = new ArrayList<>(); // ERROR: int not allowed
        ArrayList<Integer> numbers = new ArrayList<>(); // OK!

        numbers.add(10); // automatic boxing: 10 -> Integer(10), add Integer(10)
        numbers.add(20); // automatic boxing: 20 -> Integer(20), add Integer(20)
        IO.print("(10) "); // (10)
        IO.println("numbers = " + numbers);
        IO.println();

        double x = numbers.get(0); // get Integer(10), automatic unboxing: Integer(10) -> 10,
        IO.println("x is " + x);

        if (numbers.get(1) == 20) { // get Integer(20), automatic unboxing: Integer(20) -> 20
            IO.println("20 is at index 1");
        }
    }
}
