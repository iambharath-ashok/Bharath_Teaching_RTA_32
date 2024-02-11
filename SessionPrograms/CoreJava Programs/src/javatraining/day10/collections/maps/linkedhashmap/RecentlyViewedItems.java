package javatraining.day10.collections.maps.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class RecentlyViewedItems {
    private Map<String, Item> recentlyViewed = new LinkedHashMap<>(5, 0.75f, true);

    public void viewItem(String itemId, Item item) {
        recentlyViewed.put(itemId, item);
    }

    public void displayRecentViews() {
        System.out.println("Recently Viewed Items:");
        for (Map.Entry<String, Item> entry : recentlyViewed.entrySet()) {
            System.out.println("Item ID: " + entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        RecentlyViewedItems viewedItems = new RecentlyViewedItems();
        viewedItems.viewItem("101", new Item("Product X", "Category A"));
        viewedItems.viewItem("102", new Item("Product Y", "Category B"));
        viewedItems.viewItem("103", new Item("Product Z", "Category C"));
        viewedItems.viewItem("101", new Item("Product X", "Category A"));
        viewedItems.viewItem("102", new Item("Product Y", "Category B"));

        viewedItems.displayRecentViews();
    }
}

class Item {
    String name;
    String category;

    public Item(String name, String category) {
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Item: " + name + ", Category: " + category;
    }
}
