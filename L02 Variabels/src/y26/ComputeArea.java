package y26;

/*
 * Input the radius of a circle,
 * calculate and print the area of the circle.
 */
public class ComputeArea {
    void main() {
        // Algorithm (plan):
        // Prompt (ask) the user for the circle's radius
        // Read the radius
        // Calculate the area (area = PI * radius * radius)
        // Print the area

        IO.println("Indtast radius:");
        double radius = Double.parseDouble(IO.readln());

        double area = Math.PI * radius * radius;

        IO.println(String.format("Arealet er %.1f\n", area));
    }
}








