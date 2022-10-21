package part2.q10;

import java.time.LocalDate;
import java.time.Month;

public class Q10 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2018, Month.APRIL, 30).plusMonths(-1)
                .plusYears(20);

        System.out.println(date.getYear() + " " + date.getMonth() + " "
                + date.getDayOfMonth());
    }
}
