package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2000-08-22");
        LocalDateTime d02 = LocalDateTime.parse("2000-08-22T00:00:01");
        Instant d03 = Instant.parse("2000-08-22T00:00:01Z");

        // with system default GMT (user machine)
        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r2 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        // GMT of other zones
        LocalDate r3 = LocalDate.ofInstant(d03, ZoneId.of("Brazil/East"));
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Brazil/East"));
        LocalDate r5 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
        LocalDateTime r6 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
        System.out.println("r5 = " + r5);
        System.out.println("r6 = " + r6);

        // get
        System.out.println("d01 day = " + d01.getDayOfMonth());
        System.out.println("d01 month = " + d01.getMonthValue());
        System.out.println("d01 year = " + d01.getYear());

        System.out.println("d02 hour = " + d02.getHour());
        System.out.println("d02 minute = " + d02.getMinute());
        System.out.println("d02 second = " + d02.getSecond());

        // print all Zone IDs
        /*
        for (String i : ZoneId.getAvailableZoneIds()){
            System.out.println(i);
        }
         */
    }
}
