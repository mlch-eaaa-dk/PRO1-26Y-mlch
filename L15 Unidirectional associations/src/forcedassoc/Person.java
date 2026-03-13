package forcedassoc;

public class Person {
    private String name;

    // link Person --> 1 Group
    private Group group;

    public Person(String name, Group group) {
        this.name = name;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Person(" + name + ")";
    }

    //-----------------------------------------------------
    // link methods

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
