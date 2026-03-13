package composition;

public class ToManyComposition {
    void main() {
        // create a group with no persons
        Group groupA = new Group("Group A");
        IO.println("Persons in Group A: " + groupA.getPersons());
        IO.println();

        // create a person added to groupA
        Person ib = new Person("Ib");
        groupA.addPerson(ib); // ib added to groupA
        IO.println("Ib: " + ib);
        IO.println("Persons in Group A: " + groupA.getPersons());
        IO.println();

        // create a person added to groupA
        Person ulla = new Person("Ulla");
        groupA.addPerson(ulla); // ulla added to groupA
        IO.println("Ulla: " + ulla);
        IO.println("Persons in Group A: " + groupA.getPersons());

        // a person cannot be removed from a group in a composition
    }
}
