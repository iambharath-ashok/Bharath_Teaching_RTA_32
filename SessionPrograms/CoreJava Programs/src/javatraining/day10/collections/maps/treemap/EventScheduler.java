package javatraining.day10.collections.maps.treemap;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.TreeMap;
import java.util.Map;

public class EventScheduler {
    public static void main(String[] args) {
        Map<Long, String> eventSchedule = new TreeMap<>();

        eventSchedule.put(System.currentTimeMillis() + 120000, "Presentation");
        eventSchedule.put(System.currentTimeMillis() + 60000, "Meeting");
        eventSchedule.put(System.currentTimeMillis() + 300000, "Lunch");



        // Display scheduled events
        for (Map.Entry<Long, String> entry : eventSchedule.entrySet()) {
            long timestamp = entry.getKey();
            String event = entry.getValue();
            System.out.println("At " + timestamp + ": " + event);
        }
    }
}
