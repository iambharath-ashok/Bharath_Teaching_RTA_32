package javatraining.day10.collections.maps.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class UserActivityLog {
    private Map<String, String> activityLog = new LinkedHashMap<>();

    public void logActivity(String user, String activity) {
        activityLog.put(user, activity);
    }

    public void displayLog() {
        for (Map.Entry<String, String> entry : activityLog.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        UserActivityLog log = new UserActivityLog();
        log.logActivity("user1", "Logged in");
        log.logActivity("user2", "Viewed profile");
        log.logActivity("user1", "Logged out");
        log.logActivity("user3", "Updated settings");

        log.displayLog();
    }
}
