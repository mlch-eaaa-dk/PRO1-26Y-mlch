package ex3;

public class Ex3Extended {
    void main() {
        IO.println("Enter 3 numbers: ");
        int n1 = Integer.parseInt(IO.readln());
        int n2 = Integer.parseInt(IO.readln());
        int n3 = Integer.parseInt(IO.readln());

        int a;
        int b;
        if (n1 <= n2) {
            a = n1;
            b = n2;
        } else {
            a = n2;
            b = n1;
        }
        // now a <= b

        if (n3 <= a) { // n3 <= a <= b
            IO.println(n3 + " <= " + a + " <= " + b);
        } else if (n3 >= b) { // a <= b <= n3
            IO.println(a + " <= " + b + " <= " + n3);
        } else { // a < n3 < b
            IO.println(a + " <= " + n3 + " <= " + b);
        }
    }
}
