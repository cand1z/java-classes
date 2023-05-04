package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {
    public static void main(String[] args) {

        // local date
        LocalDate d01 = LocalDate.now();
        System.out.println("Local date: " + d01);

        // local date with parameters
        LocalDate d04 = LocalDate.parse("2023-08-22");
        System.out.println("Local date with parameters: " + d04);

        // local date with parameters
        LocalDateTime d05 = LocalDateTime.parse("2023-08-22T01:22:24");
        System.out.println("Local date with parameters: " + d05);

        // local date time
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("Local date Time: " + d02);

        // global time (GMT)
        Instant d03 = Instant.now();
        System.out.println("Global time (GMT): " + d03);

    }
}
