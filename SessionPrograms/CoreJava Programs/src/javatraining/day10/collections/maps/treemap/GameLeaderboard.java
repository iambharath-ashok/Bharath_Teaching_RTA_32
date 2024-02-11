package javatraining.day10.collections.maps.treemap;

import java.util.TreeMap;
import java.util.Map;

public class GameLeaderboard {
    public static void main(String[] args) {
        Map<Integer, String> leaderboard = new TreeMap<>(java.util.Collections.reverseOrder());

        leaderboard.put(1500, "PlayerA");
        leaderboard.put(2200, "PlayerB");
        leaderboard.put(1800, "PlayerC");
        leaderboard.put(2800, "PlayerD");


        // Display leaderboard
        for (Map.Entry<Integer, String> entry : leaderboard.entrySet()) {
            System.out.println(entry.getValue() + ": " + entry.getKey() + " points");
        }
    }
}
