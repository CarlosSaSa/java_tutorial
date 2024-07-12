package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatesExample {

    // We got many ways to work with dates, we say the follows classes:
    // 1. LocalDate, LocalDateTime, Date, DateTime, LocalTime
    // 2. DateTimeFormatter

    public static void main(String[] args) {
        // Get the current date
        LocalDate now = LocalDate.now();
        System.out.println("Now => " + now.toString());

        // Change the format
        System.out.println("Now with default format => " + now.toString() + " and with custom format => " + now.format(DateTimeFormatter.ofPattern("dd/MM/yy")));

        // We can get the current datetime
        LocalDateTime nowTime = LocalDateTime.now();
        System.out.println("Current time => " + nowTime.toString());

        // And plus one day
        System.out.println("Current day plus one day => " + nowTime.plusDays(1).toString() );


    }


}
