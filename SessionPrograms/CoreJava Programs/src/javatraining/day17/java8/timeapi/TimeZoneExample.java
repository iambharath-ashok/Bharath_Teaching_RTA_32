package javatraining.day17.java8.timeapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneExample {

    String name;
    public TimeZoneExample(String name) {
      super();
      this.name = name;
    }

    public static void main(String[] args) {
        ZoneId newYorkZone = ZoneId.of("America/New_York");

        // Get the current date and time in a specific time zone
        ZonedDateTime newYorkTime = ZonedDateTime.now(newYorkZone);
        System.out.println("New York Time: " + newYorkTime);
    }
}
