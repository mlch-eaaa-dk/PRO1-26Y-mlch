package ex3;

public class B18 {
    void main() {
        IO.println(2 * 3.14159 * 6.5);
        IO.println(6.5 * 6.5 * 3.14159);

        double radius = 6.5;
        final double PI = 3.14159;
        double perimeter = 2 * radius * PI; // omkreds = 2*PI*r
        double area = radius * radius * PI; // areal = PI*r^2
        IO.println("perimeter = " + perimeter);
        IO.println("area = " + area);
    }
}
