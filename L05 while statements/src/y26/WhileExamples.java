package y26;

public class WhileExamples {
    void main() {
        // udskriv 5 gange
        //     Programming is fun
        int i = 0; // indeks for udskriften
        while (i < 5) {
            IO.println(i + " Programming is fun");
            i = i + 1;
        }
        IO.println();


        // udskriv tallene fra 1 til 10
        int j = 1;
        while (j <= 10) {
            IO.print(j + " ");
            j++;
        }
        IO.println();
        IO.println();

        // beregn summen af tallene fra 1 til 100
        int sum = 0;
        int k = 1;
        while (k <= 100) {
            sum = sum + k;
            k++;
        }
        IO.println(sum);
        IO.println();

        // beregn summen af de lige kvadrattal i 1 til 10
        int sumSquares = 0;
        int i1 = 1;
        while (i1 <= 10) {
            sumSquares = sumSquares + i1 * i1;
            i1 = i1 + 2;
        }
        IO.println(sumSquares);
    }
}
