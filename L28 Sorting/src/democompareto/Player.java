package democompareto;

public class Player implements Comparable<Player> {
    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + "-" + score;
    }

    // Compare on names.
    @Override
    public int compareTo(Player that) {
        return this.name.compareTo(that.name);
    }

//    // Compare on scores.
//    @Override
//    public int compareTo(Player other) {
//        return Integer.compare(this.score, other.score);
//    }

//    // Compare on names first and then on scores.
//    @Override
//    public int compareTo(Player other) {
//        int compareNames = this.name.compareTo(other.name);
//        if (compareNames != 0) {
//            return compareNames;
//        }
//        return Integer.compare(this.score, other.score);
//    }
}
