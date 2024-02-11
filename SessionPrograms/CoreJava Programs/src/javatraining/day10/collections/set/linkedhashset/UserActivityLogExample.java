package javatraining.day10.collections.set.linkedhashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UserActivityLogExample {
    public static void main(String[] args) {
        Set<String> userActivityLog = new LinkedHashSet<>();
        userActivityLog.add("Logged in");
        userActivityLog.add("Viewed Dashboard");
        userActivityLog.add("Search For Text");
        userActivityLog.add("Logged out");
        userActivityLog.add("Logged in"); // Duplicate

        System.out.println("User Activity Log: " + userActivityLog);
    }
}
