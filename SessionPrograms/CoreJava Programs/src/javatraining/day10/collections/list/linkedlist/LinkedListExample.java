package javatraining.day10.collections.list.linkedlist;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList to store playlist of songs
        LinkedList<String> playlist = new LinkedList<>();

        // Adding songs to the end of the playlist
        playlist.add("Song 1");
        playlist.add("Song 2");
        playlist.add("Song 4");
        playlist.add(2, "Song 3");


        // Inserting a song at the beginning of the playlist
        playlist.addFirst("Intro Song");

        // Displaying the playlist
        System.out.println("Playlist: " + playlist);

        // Removing the second song from the playlist
        playlist.remove(1);

        // Displaying the modified playlist
        System.out.println("Modified Playlist: " + playlist);

        // Accessing the first and last songs
        String firstSong = playlist.getFirst();
        String lastSong = playlist.getLast();
        System.out.println("First Song: " + firstSong);
        System.out.println("Last Song: " + lastSong);
    }
}
