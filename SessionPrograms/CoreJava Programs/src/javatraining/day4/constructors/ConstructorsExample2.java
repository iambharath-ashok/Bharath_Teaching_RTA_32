package javatraining.day4.constructors;

class Student {
    String name;
    int age;

    // Parameterized Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class    ConstructorsExample2 {


    public static void main(String[] args) {
        Student student1 = new Student("John", 20);
        // Memory will allocated on the heap
        //Memory will be allocated for Properties of the class
        // Reference of the memory address will be assigned to Reference Variable
        ConstructorsExample2.method1();
        Student student3 = new Student("Emily", 22);

        System.out.println("Student 1 - Name: " + student1.name + ", Age: " + student1.age);
        System.out.println("Student 2 - Name: " + student3.name + ", Age: " + student3.age);
    }

    public static void method1() {
        System.out.println("Method 1");
        Student student2 = new Student("Bikash", 19);
        System.out.println(student2);
        method2();
        System.out.println("Student 2 - Name: " + student2.name + ", Age: " + student2.age);
    }

    public static void method2() {
        System.out.println("Method 2");
        Student student4 = new Student("Sanjay", 24);
        System.out.println(student4);
        System.out.println("Student 2 - Name: " + student4.name + ", Age: " + student4.age);
    }
}
