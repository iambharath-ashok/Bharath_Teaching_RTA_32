package javatraining.assignments.oops.getterssetters;

class Student {
    private String name;
    private int age;
    private String studentId;

    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Student class using the constructor
        Student student = new Student("John Doe", 20, "123456");

        // Display student information using getter methods
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student ID: " + student.getStudentId());

        // Update student information using setter methods
        student.setName("Jane Smith");
        student.setAge(22);
        student.setStudentId("789012");

        // Display updated student information
        System.out.println("\nUpdated Student Name: " + student.getName());
        System.out.println("Updated Student Age: " + student.getAge());
        System.out.println("Updated Student ID: " + student.getStudentId());
    }
}
