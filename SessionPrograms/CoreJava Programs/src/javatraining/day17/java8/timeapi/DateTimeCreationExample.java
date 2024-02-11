package javatraining.day17.java8.timeapi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateTimeCreationExample {
    public static void main(String[] args) {
        // Current date

        //Date date = new Date();
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        // Current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        // Current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        LocalDateTime australiaSydenyTime = LocalDateTime.now(ZoneId.of("Australia/Sydney"));
        System.out.println("Australia LocalDateTime: "+australiaSydenyTime);

        LocalDate particularDate = LocalDate.of(1991,12,31);
        System.out.println(particularDate);
    }
}
