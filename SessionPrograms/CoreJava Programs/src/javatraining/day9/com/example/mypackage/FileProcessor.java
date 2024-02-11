package javatraining.day9.com.example.mypackage;

import java.io.File;

import java.io.IOException;

public class FileProcessor {
    public static void main(String[] args){

        File f = new File("C:fileOperations.txt");
        try {
            if (f.createNewFile()) {
                System.out.println("File successfully created");
                //processFile();
            }
            else
                System.out.println("File is already exist in the directory.");
        }
        catch(IOException e){
            System.out.println("File creation failed");
        }
    }
  //  static void processFile(){
}
