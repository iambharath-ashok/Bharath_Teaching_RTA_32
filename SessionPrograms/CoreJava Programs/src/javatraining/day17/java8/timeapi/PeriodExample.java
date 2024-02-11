package javatraining.day17.java8.timeapi;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2023, 1, 15);
        LocalDate endDate = LocalDate.of(2050, 2, 15);

        // Calculate the period between two LocalDate instances
        Period period = Period.between(startDate, endDate);
        System.out.println("Period: " + period.getMonths() + " months");
    }
}
