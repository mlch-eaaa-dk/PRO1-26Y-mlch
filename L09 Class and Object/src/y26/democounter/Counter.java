package y26.democounter;

public class Counter {
    private String color;
    private int count;

    public Counter(String color) {
//        this.color = color;
//        this.count = 0;
        this(color,0);
    }

    public Counter(String color, int initialCount) {
        this.color = color;
        this.count = initialCount;
    }

    public String getColor() {
        return color;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void click() {
        this.count++;
        System.out.println("\t" + this + " was clicked");
    }

    public void reset() {
        this.count = 0;
        System.out.println("\t" + this + " was reset");
    }

    @Override
    public String toString() {
        return "Counter(" + this.color + ", " + this.count + ")";
    }
}
