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

    // Print the char 'ch' 'count' times
    public void printChar(char ch, int count) {
        for (int i = 1; i <= count; i++) {
            IO.print(ch);
        }
    }


    public void exB(int rowCount) {
        for (int row = 1; row <= rowCount; row++) {
            // print row number
            IO.print(String.format("%2d: ", row));

            // print dashes
            int dashCount = rowCount - row;
            printChar(' ', dashCount);

            // print stars
            int starCount = rowCount - dashCount;
            printChar('*', starCount);

            IO.println();
        }
    }

    public void exC(int rowCount) {
        for (int row = 1; row <= rowCount; row++) {
            // print row number
            IO.print(String.format("%2d: ", row));

            // print dashes
            int dashCount = row - 1;
            printChar(' ', dashCount);

            // print stars
            int starCount = rowCount - dashCount;
            printChar('*', starCount);

            IO.println();
        }
    }

    public void exD(int rowCount) {
        for (int row = 1; row <= rowCount; row++) {
            // print row number
            IO.print(String.format("%2d: ", row));

            // calculate star count
            int starCount;
            if (row <= rowCount / 2) {
                starCount = 2 * row - 1;
            } else {
                starCount = 2 * (rowCount - row) + 1;
            }
            // calculate dash count on each side
            int dashCount = rowCount - starCount;

            // print dashes
            printChar(' ', dashCount / 2);

            // print stars
            printChar('*', starCount);

            // print dashes
            printChar(' ', dashCount / 2);

            IO.println();
        }
    }

}
