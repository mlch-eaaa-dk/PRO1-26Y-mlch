package y26;

/*
 Input number of seconds,
 convert it to minutes and seconds,
 print minutes and seconds.
 */
public class DisplayTime {
    void main() {
        // Algorithm:
        // Prompt the user for number of seconds
        // calculate minutes
        // calculate remaining seconds
        // print minutes and seconds

        IO.println("Indtast antal sekunder:");
        int seconds = Integer.parseInt(IO.readln());

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        IO.println("Antal minutter er " + minutes + ", antal sekunder er " + remainingSeconds);
    }
}











