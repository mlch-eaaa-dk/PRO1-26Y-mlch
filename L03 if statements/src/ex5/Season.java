package ex5;

public class Season {
    void main() {
        IO.println("Måned nummer:");
        int month = Integer.parseInt(IO.readln());
        IO.println("Dag nummer:");
        int day = Integer.parseInt(IO.readln());

        String season;
        if (month == 12 || month == 1 || month == 2) {
            season = "Vinter";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "Forår";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "Sommer";
        } else {
            season = "Efterår";
        }

        if ((month == 2 || month == 5 || month == 8 || month == 11) && day >= 21) {
            if (season.equals("Vinter")) {
                season = "Forår";
            } else if (season.equals("Forår")) {
                season = "Sommer";
            } else if (season.equals("Sommer")) {
                season = "Efterår";
            } else {
                season = "Vinter";
            }
        }
        IO.println(season);
    }
}
