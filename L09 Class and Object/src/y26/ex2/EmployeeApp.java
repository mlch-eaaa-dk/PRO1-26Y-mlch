package y26.ex2;

public class EmployeeApp {
    void main() {
        Employee e1 = new Employee("Hans Jensen", true);
        IO.println("Test: " + e1);
        IO.println();

        IO.println("Name: " + e1.getName());
        IO.println("Trainee? " + e1.isTrainee());
        IO.println();

        e1.setTrainee(false);
        IO.println("Trainee? " + e1.isTrainee());
        IO.println();
    }
}
