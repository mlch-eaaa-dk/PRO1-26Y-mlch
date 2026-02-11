package y26;

public class TestMax {
    void main() {
        // calculate the biggest number
        int number1 = 50;
        int number2 = 100;
        int result = max(number1, number2);
        // print the biggest number
        IO.println("The max of " + number1 + " and " + number2 + " is: " + result);
    }

    /** Return the max between the two given numbers */
    public int max(int num1, int num2) {
        int result;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }
}
