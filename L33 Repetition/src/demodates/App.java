package demodates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class App {
    void main() {
        // create a date
        LocalDate d1 = LocalDate.of(2014, 6, 3);
        IO.println("d1 = " + d1);

        // create a date
        LocalDate d2 = LocalDate.parse("2014-06-03");
        IO.println("d2 = " + d2);

        // create a date from another date
        LocalDate d3 = d2.plusMonths(1).plusDays(70);
        IO.println("d3 = " + d3);
        IO.println();

        // create a period
        Period period = Period.between(d1, d3);
        IO.println("period = " + period);
        // print period formatted
        IO.println(String.format(
                "From %s to %s: %d years, %d months, %d days",
                d1, d3, period.getYears(), period.getMonths(), period.getDays()
        ));
        IO.println();

        // calculate number of months between to days
        long months = d1.until(d3, ChronoUnit.MONTHS);
        IO.println(String.format("From %s to %s: %d months", d1, d2, months));

        // calculate number of days between to days
        long days = d1.until(d3, ChronoUnit.DAYS);
        IO.println(String.format("From %s to %s: %d days", d1, d2, days));
        IO.println();

        // create a time of day
        LocalTime t1 = LocalTime.of(0, 10);
        IO.println("t1 = " + t1);

        // create a time of day
        LocalTime t2 = LocalTime.parse("00:10");
        IO.println("t2 = " + t2);

        // create a time from another time
        LocalTime t3 = t1.plusHours(1).plusMinutes(1);
        IO.println("t3 = " + t3);
        IO.println();

        // calculate number of minuts between to times
        Long minutes = t1.until(t3, ChronoUnit.MINUTES);
        IO.println(String.format("From %s to %s: %d minutes", t1, t3, minutes));
        IO.println();

        // create a date and time
        LocalDateTime dt1 = LocalDateTime.of(2014, 7, 25, 0, 10);
        IO.println("dt1 = " + dt1);

        // create a date and time
        LocalDateTime dt2 = LocalDateTime.parse("2014-07-25T00:10");
        IO.println("dt2 = " + dt2);

        // create a date and time from another date and time
        LocalDateTime dt3 = dt1.plusDays(1).plusHours(1).plusMinutes(1);
        IO.println("dt3 = " + dt3);
        IO.println();

        // calculate number of minutes between to date-times
        Long minutes1 = dt1.until(dt3, ChronoUnit.MINUTES);
        IO.println(String.format("From %s to %s: %d minutes", dt1, dt3, minutes1));
        IO.println(String.format(
                "From %1$tF at %1$tT to %2$tF at %2$tT: %3$d minutes",
                dt1, dt2, minutes1
        ));
    }
}
