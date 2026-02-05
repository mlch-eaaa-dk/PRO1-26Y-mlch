package ex4;

public class Ex25 {
    void main() {
        IO.println("Enter subtotal: ");
        double subtotal = Double.parseDouble(IO.readln());
        IO.println("Enter gratuity rate (%): ");
        double gratuityRate = Double.parseDouble(IO.readln());

        double gratuity = subtotal * gratuityRate / 100;
        double total = subtotal + gratuity;

        IO.println("Gratuity is " + gratuity);
        IO.println("Total is " + total);
    }
}
