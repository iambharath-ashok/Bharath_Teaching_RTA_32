package javatraining.day7.exceptions.trycatch;

import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
            String line = reader.readLine();
            System.out.println(line);
            reader.close();
        } catch ( IOException e) {
            System.out.println("File handling exception: " + e);
        } catch (Exception e) {
            System.out.println("Generic Exception Handling");
        }



    }
}
