package javatraining.day7.exceptions.trycatch;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.instagram90.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            System.out.println("Connected successfully");
            connection.disconnect();
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (IOException | ArrayIndexOutOfBoundsException | NullPointerException  e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
