package javatraining.day10.collections.comparableandcomparator.comparable;

import java.util.*;

class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double gpa;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student other) {
        return this.age - other.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 22, 7.3));
        students.add(new Student("Bob", 20, 8.3));
        students.add(new Student("Charlie", 25, 9.1));

        System.out.println("Without Sorting:: "+ students);
        System.out.println("===========================================");

        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("===========================================");
        Comparator<Student> studentComparator = Comparator.comparing(Student::getGpa).reversed();

        Collections.sort(students, studentComparator);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
