package javatraining.day10.collections.comparableandcomparator.comparator;

import java.util.*;


class Student implements Comparable<Student> {
    public String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {
        return this.age - other.age;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 25));

        // Sort by name using a custom comparator
        Collections.sort(students, new NameComparator());


        Collections.sort(students);



        System.out.println("Sorting By Name");

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("================================================");
        Collections.sort(students, new NameLengthComparator());
        System.out.println("Sorting By Name Length");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("================================================");
        Collections.sort(students);
        System.out.println("Sorting By Age Comparable");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

class NameLengthComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().length() - s2.getName().length();
    }
}
