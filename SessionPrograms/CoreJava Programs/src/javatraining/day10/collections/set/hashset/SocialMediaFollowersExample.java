package javatraining.day10.collections.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class SocialMediaFollowersExample {
    public static void main(String[] args) {
        Set<String> userFollowers = new HashSet<>();
        userFollowers.add("user123");
        userFollowers.add("user456");
        userFollowers.add("user123"); // Duplicate
        userFollowers.add("user789");

        System.out.println("Followers of User123: " + userFollowers);
    }
}
