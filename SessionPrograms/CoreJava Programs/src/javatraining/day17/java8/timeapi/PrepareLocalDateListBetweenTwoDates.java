package javatraining.day17.java8.timeapi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PrepareLocalDateListBetweenTwoDates {
    public static void main(String[] args) {
        List<LocalDate> localDateList = new ArrayList<>();
        LocalDate startDate = LocalDate.of(2024,01,01);
        LocalDate endDate = LocalDate.of(2024,02,14);
        int counter = 0;
        for(;true;) {
            LocalDate latestDate = startDate.plusDays(counter++);
            if(latestDate.isBefore(endDate)) {
                localDateList.add(latestDate);
            } else {
                break;
            }

        }
        localDateList.forEach(System.out::println);
    }
}
