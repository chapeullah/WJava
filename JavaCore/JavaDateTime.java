package JavaCore;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class JavaDateTime {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = localDateTime.format(formatter);
        LocalDate birthDay = LocalDate.of(2025, 8, 15);
        LocalDateTime someDateTime1 = LocalDateTime.of(2025, 9, 1, 12, 0);
        LocalDateTime someDateTime2 = LocalDateTime.of(2025, 7, 4, 9, 30);

        Instant instant = Instant.now();

        System.out.println(localTime + "\n\n" + localDateTime + "\n\n" + instant + "\n\n" + newDateTime + "\n\n" + birthDay + "\n");
        if (someDateTime1.isBefore(someDateTime2)) {
            System.out.println(someDateTime1 + " до " + someDateTime2);
        }
        else if (someDateTime1.isEqual(someDateTime2)) {
            System.out.println(someDateTime1 + " равно " + someDateTime2);
        } 
        else if (someDateTime1.isAfter(someDateTime2)) {
            System.out.println(someDateTime1 + " после " + someDateTime2);
        }
    }
}