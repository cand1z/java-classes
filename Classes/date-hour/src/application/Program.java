package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        // local date
        LocalDate d01 = LocalDate.now();
        System.out.println("Local date: " + d01);

        // local date with parameters
        LocalDate d04 = LocalDate.parse("2023-08-22");
        System.out.println("Local date with parameters: " + d04);

        // local date time
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("Local date Time: " + d02);

        // local date with parameters
        LocalDateTime d05 = LocalDateTime.parse("2023-08-22T01:22:24");
        System.out.println("Local date with parameters: " + d05);

        // global time (GMT)
        Instant d03 = Instant.now();
        System.out.println("Global time (GMT): " + d03);

        // global time (GMT) with parameters
        Instant d06 = Instant.parse("2023-08-22T00:01:00Z");
        System.out.println("Global time (GMT) with parameters: " + d06);

        // global time (GMT) with parameters and dif timezone
        Instant d07 = Instant.parse("2023-08-22T00:01:00-03:00");
        System.out.println("Global time (GMT) with parameters: " + d07);

        // set new date-time format (https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/text/SimpleDateFormat.html)
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("20/08/2000", fmt01);
        System.out.println("Local date with a fmt01 date-time format: " + d08);

        // set new date-time format (https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/text/SimpleDateFormat.html)
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime d09 = LocalDateTime.parse("20/08/2000 00:00:30", fmt02);
        System.out.println("Local date with a fmt02 date-time format: " + d09);

        // local date of
        LocalDate d10 = LocalDate.of(2000, 8, 22);
        System.out.println("Local date of: " + d10);

        // local date time of
        LocalDateTime d11 = LocalDateTime.of(2000, 8, 22, 1, 30);
        System.out.println("Local date time of: " + d11);
    }
}
