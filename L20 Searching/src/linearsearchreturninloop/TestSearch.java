package linearsearchreturninloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSearch {
    void main() {
        int[] numbers = {12, 4, 8, 2, 7, 24, 11, 8, 10};
        IO.println(Arrays.toString(numbers));

        int value = 8;
        boolean found = linearSearchArray(numbers, value);
        IO.println(String.format("Is %d in the array: %b", value, found));
        IO.println();

        //-------------------------------------------------------------------------

        ArrayList<String> names = new ArrayList<>(
                List.of("Ulla", "Pia", "Peter", "Hans", "Jens")
        );
        IO.println(names);

        String name = "Hans";
        int indexOfName = linearSearchList(names, name);
        IO.println(String.format("Index of %s in the list: %d", name, indexOfName));
        IO.println();

        //-------------------------------------------------------------------------

        ArrayList<Kunde> kunder = new ArrayList<>(List.of(
                new Kunde("Ulla", 1, 100),
                new Kunde("Pia", 2, 200),
                new Kunde("Peter", 3, 300),
                new Kunde("Hans", 5, 500),
                new Kunde("Jens", 4, 400)));
        IO.println(kunder);

        String navn = "Pia";
        Kunde kunde = linearSearchKunde(kunder, navn);
        IO.println(String.format("Kunde med navn %s i listen: %s", navn, kunde));
        IO.println();

        //-------------------------------------------------------------------------

        String sm = "The quick brown fox jumps over the lazy dog";
        String m = "fox";
        int indexOfText = find(sm, m);
        IO.println(String.format("Index of '%s' in '%s': %d", m, sm, indexOfText));
        indexOfText = findOneMethod(sm, m);
        IO.println(String.format("Index of '%s' in '%s': %d", m, sm, indexOfText));
    }

    // Linear search in array of integers.

    /** Return true, if the target is found in the array. */
    public static boolean linearSearchArray(int[] arr, int target) {
        for (int k : arr) { // UGLY code according to some programmers
            if (k == target) {
                return true;
            }
        }
        return false;
    }

    // Linear search in ArrayList<String>.

    /**
     * Return the first index, where the target is found in the list.
     * Return -1, if the target is not found in the array.
     */
    public static int linearSearchList(ArrayList<String> list, String target) {
        for (int i = 0; i < list.size(); i++) { // NOT for-each, when index is returned
            String k = list.get(i);
            if (k.equals(target)) {
                return i;
            }
        }
        return -1;
    }

    // Linear search in ArrayList<Kunde>.

    /**
     * Return the first customer with the given name.
     * Return null, if the customer is not found in the list.
     */
    public static Kunde linearSearchKunde(ArrayList<Kunde> list, String name) {
        for (Kunde k : list) { // UGLY code according to some programmers
            if (k.getNavn().equals(name)) {
                return k;
            }
        }
        return null;
    }

    // ADVANCED SEARCH

    /**
     * Return the start index of the string m in the string sm.
     * Return -1, if m is not found in sm.
     */
    public static int find(String sm, String m) {
        for (int i = 0; i <= sm.length() - m.length(); i++) {
            boolean matchFound = match(sm, m, i);
            if (matchFound) {
                return i;
            }
        }
        return -1;
    }

    // Return true, if m is part of sm, starting at the index i.
    private static boolean match(String sm, String m, int i) {
        for (int j = 0; j < m.length(); j++) {
            char k = sm.charAt(i + j);
            if (k != m.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    // ADVANCED SEARCH with ONE method

    /**
     * Return the start index of the string m in the string sm.
     * Return -1, if m is not found in sm.
     */
    public static int findOneMethod(String sm, String m) {
        for (int i = 0; i <= sm.length() - m.length(); i++) {
            boolean foundDiff = false;
            for (int j = 0; j < m.length(); j++) {
                char k = sm.charAt(i + j);
                if (k != m.charAt(j)) {
                    foundDiff = true;
                    break; // VERY UGLY, break is FORBIDDEN!
                }
            }
            if (!foundDiff) {
                return i;
            }
        }
        return -1;
    }
}
