package javatraining.day10.collections.maps.hashmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserPreferences {
    private Map<String, String> preferences = new HashMap<>();


    public void setPreference(String key, String value) {
        preferences.put(key, value);
    }

    public String getPreference(String key) {
        return preferences.get(key);
    }

    public static void main(String[] args) {
        UserPreferences userPrefs = new UserPreferences();
        userPrefs.setPreference("theme", "dark");
        userPrefs.setPreference("language", "English");

        System.out.println("Theme: " + userPrefs.getPreference("theme"));
        System.out.println("Language: " + userPrefs.getPreference("language"));
    }
}
