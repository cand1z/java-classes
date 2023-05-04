package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2000-08-22");
        LocalDateTime d02 = LocalDateTime.parse("2000-08-22T00:00:01");
        Instant d03 = Instant.parse("2000-08-22T00:00:01Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("d01 = " + d01.format(fmt1));
        System.out.println("d01 = " + fmt1.format(d01));
        System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("d02 = " + d02.format(fmt2));
        System.out.println("d02 = "+ fmt2.format(d02));
        System.out.println("d02 = "+ d02.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        System.out.println("d03 = "+ fmt3.format(d03));
    }
}
