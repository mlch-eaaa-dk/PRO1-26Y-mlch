package ex2;

public class Ex2 {
    void main() {
        IO.println("Skriv 3 heltal:");
        int number1 = Integer.parseInt(IO.readln());
        int number2 = Integer.parseInt(IO.readln());
        int number3 = Integer.parseInt(IO.readln());

        if (number1 <= number2 && number2 <= number3) {
            System.out.println(number1 + " " + number2 + " " + number3 + " er voksende");
        } else if (number1 >= number2 && number2 >= number3) {
            System.out.println(number1 + " " + number2 + " " + number3 + " er aftagende");
        } else {
            System.out.println(number1 + " " + number2 + " " + number3 + " er hverken-eller");
        }
    }
}
