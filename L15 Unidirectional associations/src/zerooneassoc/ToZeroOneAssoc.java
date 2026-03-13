package zerooneassoc;

public class ToZeroOneAssoc {
    void main() {
        Group groupA = new Group("Group A");
        Group groupB = new Group("Group B");

        // create a person ib without a group
        Person ib = new Person("Ib"); // ib's group is null
        IO.println("Ib's group: " + ib.getGroup());

        // set ib's group to groupA
        ib.setGroup(groupA);
        IO.println("Ib's group: " + ib.getGroup());

        // change ib's group from groupA to groupB
        ib.setGroup(groupB);
        IO.println("Ib's group: " + ib.getGroup());

        // remove ib's group
        ib.setGroup(null);
        IO.println("Ib's group: " + ib.getGroup());
        // IO.println("Ib's group: " + ib.getGroup().toString());
    }
}
