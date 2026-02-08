package book.listing3_2;

public class SimpleIfDemo {
    void main() {
        IO.print("Enter an integer: ");
        int number = Integer.parseInt(IO.readln());

        if (number % 5 == 0) {
            System.out.println("HiFive");
        }

        if (number % 2 == 0) {
            System.out.println("HiEven");
        }
    }
}