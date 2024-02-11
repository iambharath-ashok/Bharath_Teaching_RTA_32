package javatraining.day10.collections.maps.hashmap;

import java.util.HashMap;
import java.util.Map;

public class StudentDatabase {
    public static void main(String[] args) {
        Map<Integer, Student> studentDatabase = new HashMap<>();

        studentDatabase.put(101, new Student("Alice", 18, "A"));
        studentDatabase.put(102, new Student("Bob", 19, "B"));

        studentDatabase.keySet().iterator();

        // Accessing student details
        int studentId = 101;
        Student student = studentDatabase.get(studentId);
        System.out.println("Student " + studentId + ": " + student);
    }
}

class Student {
    String name;
    int age;
    String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + ", Age: " + age + ", Grade: " + grade;
    }
}
