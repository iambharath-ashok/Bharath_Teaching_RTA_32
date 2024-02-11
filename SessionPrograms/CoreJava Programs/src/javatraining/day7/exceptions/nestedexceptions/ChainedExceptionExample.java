package javatraining.day7.exceptions.nestedexceptions;

public class ChainedExceptionExample {
    public static void main(String[] args) {
        try {

            processFile("file.txt");
        } catch (FileProcessingException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Original Cause: " + e.getCause().getMessage());
        }
    }

    public static void processFile(String filename) throws FileProcessingException {
        try {
            readContents(filename);
        } catch (OutOfMemoryError e) {
            throw new FileProcessingException("Error processing file: " + filename, e);
        }
    }

    public static void readContents(String filename) throws OutOfMemoryError {
        // Simulating an IOException when trying to read the file
        throw new OutOfMemoryError("Could not read file: " + filename);
    }
}

class FileProcessingException extends Exception {
    public FileProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
