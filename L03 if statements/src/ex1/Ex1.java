package ex1;

public class Ex1 {
    void main() {
        IO.println("Skriv et heltal:");
        int number = Integer.parseInt(IO.readln());

        if (number < 0) {
            System.out.println("negativ");
        } else if (number == 0) {
            System.out.println("0");
        } else {
            System.out.println("positiv");
        }
    }
}
