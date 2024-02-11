package javatraining.assignmentssubmission;

import java.util.Scanner;

public class InputExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for String (one word)
        System.out.print("Enter Value For String 1: ");
        String str1 = scanner.next();
        System.out.println("Entered String str1: " + str1);

        // Input for String (complete sentence)
        System.out.print("Enter Value For String 2: ");
        scanner.nextLine(); // Consume the newline character left by previous next()
        String str2 = scanner.nextLine();
        System.out.println("Entered String str2: " + str2);

        // Input for Integer
        System.out.print("Enter Value For Integer: ");
        int x = scanner.nextInt();
        System.out.println("Entered Integer Value: " + x);

        // Input for Float
        System.out.print("Enter Value For Float: ");
        float f = scanner.nextFloat();
        System.out.println("Entered Float Value: " + f);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
