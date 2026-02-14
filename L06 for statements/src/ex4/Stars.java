package ex4;

public class Stars {
    void main() {
        exA(10);
        IO.println();

        exB(10);
        IO.println();

        exC(10);
        IO.println();

        exD(10);
        IO.println();

        exD(11);
        IO.println();
    }

    public void exA(int rowCount) {
        for (int row = 1; row <= rowCount; row++) {
            // print row number
            IO.print(String.format("%2d: ", row));
            
            // print stars
            int starCount = rowCount - row + 1;
            for (int i = 1; i <= starCount; i++) {
                IO.print('*');
            }

            // print dashes
            int dashCount = rowCount - starCount;
            for (int i = 1; i <= dashCount; i++) {
                IO.print('-');
            }

            IO.println();
        }
    }

    public static void exB(int rowCount) {
        // TODO
        IO.println("NOT IMPLEMENTED");
    }

    public static void exC(int rowCount) {
        // TODO
        IO.println("NOT IMPLEMENTED");
    }

    public static void exD(int rowCount) {
        // TODO
        IO.println("NOT IMPLEMENTED");
    }
}
