package democompareto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    void main() {
        String per = "Per";
        String peter = "Peter";
        String per2 = new String("Per");
        IO.println("per.compareTo(peter) returns " + per.compareTo(peter));
        IO.println("peter.compareTo(per) returns " + peter.compareTo(per));
        IO.println("per.compareTo(per2) returns " + per.compareTo(per2));
        IO.println();

        // Hvis en klasse T implementerer Comparable<T> interfacet,
        // kan klassens objekter sammenlignes med compareTo(T t) metoden
        // (og derfor også sorteres).
        // Alle Javas almindelige klasser som String, LocalDate, Integer, Double, osv.
        // har en compareTo() metode.

        //         |  a.compareTo(b) returns  |
        //---------+--------------------------+-------------------
        //  a < b  |     < 0   (negative int) |  a.compareTo(b) < 0
        //  a = b  |     = 0   (zero)         |  a.compareTo(b) == 0
        //  a > b  |     > 0   (positive int) |  a.compareTo(b) > 0

        if (peter.compareTo(per2) < 0) {
            IO.println("Peter kommer før Per");
        }

        IO.println();
        IO.println("//-------------------------------------------------");
        IO.println();

        ArrayList<Integer> integers = new ArrayList<>(List.of(
                11, 3, 2, 5, 17, 9, 30, 15, 2, 4, 11, 10
        ));
        IO.println("Før sortering:");
        IO.println(integers);

        // Integer implements the Comparable<Integer> interface,
        // Integer has a compareTo(Integer) method
        Collections.sort(integers);
        IO.println("Efter sortering:");
        IO.println(integers);
        IO.println();

        ArrayList<String> strings = new ArrayList<>(List.of(
                "Ea", "Yvonne", "Ulla", "Pia", "Anne", "Anna", "Berit"
        ));
        IO.println("Før sortering:");
        IO.println(strings);

        // String implements the Comparable<String> interface,
        // String has a compareTo(String) method
        Collections.sort(strings);
        IO.println("Efter sortering:");
        IO.println(strings);
        IO.println();

        //-------------------------------------------------

        ArrayList<Player> players = new ArrayList<>(List.of(
                new Player("Per", 11), new Player("Hans", 15), new Player("Ib", 2),
                new Player("Jens", 5), new Player("Pia", 17), new Player("Ulla", 9),
                new Player("Per", 30), new Player("Hans", 3), new Player("Per", 2),
                new Player("Pia", 4), new Player("Mike", 11), new Player("Ea", 10)
        ));
        IO.println("Før sortering:");
        IO.println(players);

        // Player implements the Comparable<Player> interface,
        // Player has a compareTo(Player) method
        Collections.sort(players);
        IO.println("Efter sortering:");
        IO.println(players);
    }
}
