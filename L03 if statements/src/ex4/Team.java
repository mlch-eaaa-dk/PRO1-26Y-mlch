package ex4;

public class Team {
    void main() {
        IO.println("Gender? (girl or boy)");
        String gender = IO.readln();
        IO.println("Age? (positive integer)");
        int age = Integer.parseInt(IO.readln());

        boolean isGirl = gender.equalsIgnoreCase("girl");
        boolean isUnder8 = age < 8;
        if (isGirl) { // girl
            if (isUnder8) {
                IO.println("Tumbling girls");
            } else {
                IO.println("Springy girls");
            }
        } else { // boy
            if (isUnder8) {
                IO.println("Young cubs");
            } else {
                IO.println("Cool boys");
            }
        }
    }
}
