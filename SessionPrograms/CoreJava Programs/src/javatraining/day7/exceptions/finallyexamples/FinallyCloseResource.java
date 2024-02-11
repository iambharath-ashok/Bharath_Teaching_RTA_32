package javatraining.day7.exceptions.finallyexamples;

import java.io.*;

public class FinallyCloseResource {
    public static void main(String[] args) {
        BufferedReader reader = null;
        //
        try {
            reader = new BufferedReader(new FileReader("file.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e);
        } finally {
            try {
                if (reader != null) {
                    reader.close(); // Close the resource in the finally block
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e);
            }
        }
    }
}
