package javatraining.day4.classmembers;

class Student {
    // Instance variables
    String name;
    int age;
    double gpa;

  public Student(String name, int age) {

  }

  public Student() {}

    // Instance method
    void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }

    // Instance method with parameters
    void updateInfo(String newName, int newAge, double newGpa) {
        name = newName;
        age = newAge;
        gpa = newGpa;
    }
}

public class ClassMembersExample1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "John";
        student1.age = 20;
        student1.gpa = 3.8;

        student1.displayInfo();

        Student student2 = new Student();
        student2.name = "Emily";
        student2.age = 22;
        student2.gpa = 3.9;

        student2.updateInfo("Emma", 23, 4.0);
        student2.displayInfo();
    }
}
