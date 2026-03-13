package forcedassoc;

public class ForcedAssoc {
    void main() {
        // create a group
        Group groupA = new Group("Group A");

        // create a person ib connected to groupA
        Person ib = new Person("Ib", groupA); // groupA is ib's group
        IO.println("Ib's group: " + ib.getGroup());

        // change ib's group from groupA to groupB
        Group groupB = new Group("Group B");
        ib.setGroup(groupB); // groupB is ib's group
        IO.println("Ib's group: " + ib.getGroup());

//        // setting ib's group to null is not allowed
//        ib.setGroup(null);
//        IO.println("Ib's group: " + ib.getGroup());
//        IO.println("Ib's group: " + ib.getGroup().toString());
    }
}
