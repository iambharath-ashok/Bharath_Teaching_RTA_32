package javatraining.day7.exceptions.checkedexceptions;

import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            readFromFile("file.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void readFromFile(String filename) throws IOException {
        FileReader reader = new FileReader(filename);
        // Process the file contents...
        reader.close();
    }
}
