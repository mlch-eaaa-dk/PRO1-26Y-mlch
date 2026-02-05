package ex4;

public class Ex22 {
    void main() {
        IO.println("The uniform triangular prism's length of sides:");
        double length = Double.parseDouble(IO.readln());

        double area = Math.sqrt(3) / 4.0 * Math.pow(length, 2.0);
        double volume = area * length;

        IO.println("Area of equilateral base is " + area);
        IO.println("Volume is " + volume);
    }
}
