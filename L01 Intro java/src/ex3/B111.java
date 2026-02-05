package ex3;

public class B111 {
    void main() {
        int secondsInOneYear = 365 * 24 * 3600;
        double oneYearIncrease = secondsInOneYear * (1.0 / 7 - 1.0 / 13 + 1.0 / 45);

        int populationSizeNow = 312_032_486;
        IO.print("Population now: ");
        IO.println(populationSizeNow);

        double populationSizeAfterOneYear = populationSizeNow + oneYearIncrease;
        IO.print("After 1 year : ");
        IO.println(populationSizeAfterOneYear);

        double populationSizeAfterTwoYears = populationSizeAfterOneYear + oneYearIncrease;
        IO.print("After 2 years:  ");
        IO.println(populationSizeAfterTwoYears);

        double populationSizeAfterThreeYears = populationSizeAfterTwoYears + oneYearIncrease;
        IO.print("After 3 years:  ");
        IO.println(populationSizeAfterThreeYears);

        double populationSizeAfterFourYears = populationSizeAfterThreeYears + oneYearIncrease;
        IO.print("After 4 years:  ");
        IO.println(populationSizeAfterFourYears);

        double populationSizeAfterFiveYears = populationSizeAfterFourYears + oneYearIncrease;
        IO.print("After 5 years:  ");
        IO.println(populationSizeAfterFiveYears);
        IO.println();

        IO.println(populationSizeAfterFiveYears / 1E6 + " millions");
        IO.println(String.format("%,.0f", populationSizeAfterFiveYears));
    }
}
