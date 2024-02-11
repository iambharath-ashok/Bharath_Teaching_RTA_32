package javatraining.day10.collections.set.treeset.runtimesession;

import java.util.Comparator;

public class Student implements Comparable<Student> {

    private String name;
    private int age;
    private String major;
    private double gpa;
    private char grade;

    public Student(String name, int age, String major, double gpa, char grade) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.gpa = gpa;
        this.grade = grade;
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

    public char getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                ", gpa=" + gpa +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }

/*    public static Comparator<Student> ageComparator = Comparator.comparing(Student::getAge).reversed();
    public static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGrade);
    public static Comparator<Student> gpaComparator = Comparator.comparing(Student::getGpa).reversed();*/
}
