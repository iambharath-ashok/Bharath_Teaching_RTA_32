package javatraining.day10.collections.set.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class RecentlyViewedItemsExample {
    public static void main(String[] args) {
        Set<String> recentlyViewedItems = new LinkedHashSet<>();
        recentlyViewedItems.add("Item A");
        recentlyViewedItems.add("Item B");
        recentlyViewedItems.add("Item C");
        recentlyViewedItems.add("Item B"); // Duplicate
        recentlyViewedItems.add("Item C");
        System.out.println("Recently Viewed Items: " + recentlyViewedItems);
    }
}
