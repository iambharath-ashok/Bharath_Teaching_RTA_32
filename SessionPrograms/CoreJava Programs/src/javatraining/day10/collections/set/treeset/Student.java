package javatraining.day10.collections.set.treeset;

import java.util.Comparator;

class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String major;
    private double gpa;

    public Student(String name, int age, String major, double gpa) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }



    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    // Comparator to compare students based on age
    public static Comparator<Student> ageComparator = Comparator.comparingInt(Student::getAge);

    public static Comparator<Student> gpaComparator = Comparator.comparing(Student::getGpa);

    public static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
}
