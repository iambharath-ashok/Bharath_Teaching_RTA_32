package javatraining.day10.collections.set.hashset;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class RemoveDuplicatesExample {
    public static void main(String[] args) {
        List<String> userIds = new ArrayList<>();
        userIds.add("user123");
        userIds.add("user456");
        userIds.add("user123"); // Duplicate
        userIds.add("user789");
        System.out.println("List:: "+ userIds);

        Set<String> uniqueUserIds = new HashSet<>(userIds);

        System.out.println("Unique User IDs: " + uniqueUserIds);
    }
}
