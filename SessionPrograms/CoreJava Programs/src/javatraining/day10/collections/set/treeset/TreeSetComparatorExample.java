package javatraining.day10.collections.set.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetComparatorExample {
    public static void main(String[] args) {
        // Using Comparable (natural ordering based on names)
        Set<Student> studentSet = new TreeSet<>();
        studentSet.add(new Student("Alice", 22, "Computer Science", 3.8));
        studentSet.add(new Student("Bob", 20, "Engineering", 3.5));
        studentSet.add(new Student("Charlie", 25, "Mathematics", 3.9));

        System.out.println("Students sorted by name (Comparable):");
        for (Student student : studentSet) {
            System.out.println(student.getName() + " - Age: " + student.getAge() +
                    " - Major: " + student.getMajor() + " - GPA: " + student.getGpa());
        }

        // Using Comparator (ordering based on age)
        Set<Student> studentSetByAge = new TreeSet<>(Student.ageComparator);
        studentSetByAge.add(new Student("David", 23, "Physics", 3.7));
        studentSetByAge.add(new Student("Eva", 21, "Chemistry", 3.6));
        studentSetByAge.add(new Student("Frank", 24, "Biology", 3.9));

        System.out.println("\nStudents sorted by age (Comparator):");
        for (Student student : studentSetByAge) {
            System.out.println(student.getName() + " - Age: " + student.getAge() +
                    " - Major: " + student.getMajor() + " - GPA: " + student.getGpa());
        }
    }
}
