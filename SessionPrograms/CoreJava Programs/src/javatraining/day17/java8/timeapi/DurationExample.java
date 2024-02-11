package javatraining.day17.java8.timeapi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DurationExample {
    public static void main(String[] args) {
        LocalDateTime startTime = LocalDateTime.of(2023, 1, 15, 10, 0);
        LocalDateTime endTime = LocalDateTime.of(2024, 1, 15, 14, 30);

        // Calculate the duration between two LocalDateTime instances
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Duration: " + duration.toHours() + " hours");

    }
}
