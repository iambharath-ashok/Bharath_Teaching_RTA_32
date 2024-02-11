package javatraining.day7.exceptions.trycatch;

import java.io.IOException;
import java.net.*;

public class NetworkExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            System.out.println("Connected successfully");
            connection.disconnect();
        } catch (IOException e) {
            System.out.println("Network exception: " + e);
        }
    }
}
