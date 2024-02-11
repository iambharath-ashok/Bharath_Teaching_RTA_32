package javatraining.day17.java8.timeapi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormattingParsingExample {
    public static void main(String[] args) {
        System.out.println( LocalDateTime.now());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Format a LocalDateTime
        LocalDateTime currentDateTime = LocalDateTime.now();
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);

        // Parse a date and time string
        LocalDateTime parsedDateTime = LocalDateTime.parse("2023-01-15 14:30:00", formatter);
        System.out.println("Parsed Date and Time: " + parsedDateTime);
    }
}
