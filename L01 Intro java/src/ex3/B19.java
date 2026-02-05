package ex3;

public class B19 {
    void main() {
        IO.println(5.3 * 8.6);
        IO.println(2 * (5.3 + 8.6));

        double width = 5.3;
        double height = 8.6;
        double area = width * height;
        double perimeter = 2 * (width + height);
        IO.println("area = " + area);
        IO.println("perimeter = " + perimeter);
    }
}
