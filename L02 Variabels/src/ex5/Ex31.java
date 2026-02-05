package ex5;

public class Ex31 {
    void main() {
        IO.println("Solve quadratic equation a * x^2 + b * x + c = 0");
        IO.println("Enter a, b and c:");
        double a = Double.parseDouble(IO.readln());
        double b = Double.parseDouble(IO.readln());
        double c = Double.parseDouble(IO.readln());

        double d = b * b - 4 * a * c;
        if (d > 0) {
            double r1 = (-b + Math.pow(d, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2 * a);
            System.out.println("The equation has two roots: " + r1 + " and " + r2);
        } else if (d == 0) {
            double r = -b / (2 * a);
            System.out.println("The equation has one root: " + r);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
