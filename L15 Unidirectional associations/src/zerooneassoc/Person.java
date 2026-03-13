package zerooneassoc;

public class Person {
    private String name;

    // link Person --> 0..1 Group
    private Group group; // nullable


    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person(" + name + ")";
    }

    //-----------------------------------------------------
    // link methods

    // nullable return value
    public Group getGroup() {
        return group;
    }

    // nullable param group
    public void setGroup(Group group) {
        this.group = group;
    }
}
