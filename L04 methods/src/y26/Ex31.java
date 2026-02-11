package y26;

public class Ex31 {
    void main() {
        solve(2, 3, 1);
        solve(10, 30, 20);

        double x = 3;
        double y = 5;
        double z = 7;

        solve(x, y, z);

        IO.println("Program slut");
    }

    public void solve(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double r1 = (-b + Math.pow(d, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2 * a);
            IO.println("The equation has two roots: " + r1 + " and " + r2);
        }
        if (d == 0) {
            double r = -b / (2 * a);
            System.out.println("The equation has one root: " + r);
        }
        if (d < 0) {
            System.out.println("The equation has no real roots.");
        }
    }
}

