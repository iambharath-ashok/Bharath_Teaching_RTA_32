package javatraining.day1;

public class AllDataTypesExample {
    public static void main(String[] args) {
        // Primitive Data Types
        //java is strongly typed lang
        byte age = 25;
        short population = 20000;
        int count = 1000; //4 bytes
        long distance = 12345678900L;
        float pi = 3.14f;
        double temperature = 25.5;
        char grade = 'A';
        boolean isStudent = true;

        //Strongly type
        //int salary = "Bharath";




        // Reference Data Types
        String personName = "John";


        //First Memory location address of the array will be assigned to numbers reference variable
        int[] numbers = {1, 2, 3, 4, 5};
        String[] fruits = {"apple", "banana", "orange"};

        // Custom Class
        Person person = new Person();
        Person person2 = new Person();

        person.name = "Alice";
        person.age = 30;

        person2.name = "sachin";

        Person[] personArray = new Person[]{person,person2};

        // Printing values
        System.out.println("Primitive Data Types:");
        System.out.println("byte: " + age);
        System.out.println("short: " + population);
        System.out.println("int: " + count);
        System.out.println("long: " + distance);
        System.out.println("float: " + pi);
        System.out.println("double: " + temperature);
        System.out.println("char: " + grade);
        System.out.println("boolean: " + isStudent);

        System.out.println("\nReference Data Types:");
        System.out.println("String: " + personName);
        System.out.print("int[]: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nString[]: " + String.join(", ", fruits));

        System.out.println("\nCustom Class:");
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }
}

class Person {
    String name;
    int age;
}
