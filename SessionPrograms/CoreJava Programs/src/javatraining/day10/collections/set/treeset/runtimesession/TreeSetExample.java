package javatraining.day10.collections.set.treeset.runtimesession;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        Set<Student> studentSet = new TreeSet<>();

        studentSet.add(new Student("Bob", 25, "Computer Science", 2.8, 'C'));
        studentSet.add(new Student("Alice", 22, "Computer Science", 3.8, 'A'));
        studentSet.add(new Student("Albert", 21, "Information Science", 4.8, 'B'));

        System.out.println("Natural Order of Students By Name:: ");
        for (Student student: studentSet) {
            System.out.println(student);
        }
        System.out.println("================================================");

        Comparator<Student> ageComparator = Comparator.comparing(Student::getAge).reversed();
        Comparator<Student> ageComparatorImpl = (s1, s2) -> s1.getAge() - s2.getAge();
        Comparator<Student> nameComparatorImpl = (s1, s2) -> s1.getName().compareTo(s2.getName());

        Comparator<Student> nameComparatorAnymousClass = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        };


        Set<Student> sortedStudentSetByAge = new TreeSet<>(ageComparatorImpl);
        sortedStudentSetByAge.add(new Student("Bob", 25, "Computer Science", 2.8, 'C'));
        sortedStudentSetByAge.add(new Student("Alice", 22, "Computer Science", 3.8, 'B'));
        sortedStudentSetByAge.add(new Student("Albert", 21, "Information Science", 4.8, 'A'));

        System.out.println("Students Sorted By Age:: ");
        for (Student student: sortedStudentSetByAge) {
            System.out.println(student);
        }
        System.out.println("================================================");


        Comparator<Student> gradeComparator = Comparator.comparing(Student::getGrade);

        Set<Student> sortedStudentSetByGrade = new TreeSet<>(gradeComparator);
        sortedStudentSetByGrade.add(new Student("Bob", 25, "Computer Science", 2.8, 'C'));
        sortedStudentSetByGrade.add(new Student("Alice", 22, "Computer Science", 3.8, 'B'));
        sortedStudentSetByGrade.add(new Student("Albert", 21, "Information Science", 4.8, 'A'));


        System.out.println("Students Sorted By Grade:: ");
        for (Student student: sortedStudentSetByGrade) {
            System.out.println(student);
        }
        System.out.println("================================================");
    }
}
