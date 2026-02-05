package ex3;

public class B110 {
    void main() {
        IO.println(15 / 1.6 / ((50 * 60 + 30) / 3600.0));


        double miles = 15 / 1.6;
        double hours = (50 * 60 + 30) / 3600.0;
        double averageSpeed = miles / hours;
        IO.println("Average speed is " + averageSpeed + " miles/hour");
    }
}
