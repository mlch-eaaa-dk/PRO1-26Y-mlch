package manyassoc;

public class ToManyAssoc {
    void main() {
        Person ib = new Person("Ib");
        Person ulla = new Person("Ulla");

        // create a group with no persons
        Group groupA = new Group("Group A");
        IO.println("Persons in Group A: " + groupA.getPersons());

        // add ib to groupA
        groupA.addPerson(ib); // ib added to groupA
        IO.println("Persons in Group A: " + groupA.getPersons());

        // add ulla to groupA
        groupA.addPerson(ulla); // ulla added to groupA
        IO.println("Persons in Group A: " + groupA.getPersons());

        // remove ib from groupA
        groupA.removePerson(ib); // ib removed from groupA
        IO.println("Persons in Group A: " + groupA.getPersons());
        IO.println();

        // change ulla´s group from groupA to groupB
        Group groupB = new Group("Group B");
        groupA.removePerson(ulla); // ulla removed from groupA
        groupB.addPerson(ulla); // ulla added to groupA
        IO.println("Persons in Group A: " + groupA.getPersons());
        IO.println("Persons in Group B: " + groupB.getPersons());
    }
}
