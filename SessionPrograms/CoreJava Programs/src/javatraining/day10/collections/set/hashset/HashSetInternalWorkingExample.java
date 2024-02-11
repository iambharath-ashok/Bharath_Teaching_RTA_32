package javatraining.day10.collections.set.hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;


class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return this.age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
public class HashSetInternalWorkingExample {
    public static void main(String[] args) {

        Map<String, Integer> employeeMap = new HashMap<>();
        employeeMap.put("Bhrarth", 27);
        employeeMap.put("Bikash", 25);
        employeeMap.put("Ramya", 29);
        employeeMap.put("Bhrarth", 30);

        Set<String> fruitSet = new HashSet<>(1, 1f);

        fruitSet.add("Apple");//8
        fruitSet.add("Banana");
        fruitSet.add("Orange");
        fruitSet.add("Grapes");
        fruitSet.add("Pear"); //8

        fruitSet.add("Mango"); //8
        fruitSet.add(null);
        fruitSet.add(null);
        fruitSet.add(null);
        fruitSet.add(null);
        fruitSet.add(null);
        fruitSet.add(null);
        fruitSet.add(null);
        fruitSet.add(null);
        fruitSet.add(null);

        for (String fruit : fruitSet) {
            System.out.println("Fruit:: "+fruit);
        }



        Set<Boolean> booleanSet = new HashSet<>();
        booleanSet.add(true);
        booleanSet.add(false);
        booleanSet.add(true);
        booleanSet.add(false);
        booleanSet.add(true);
        booleanSet.add(false);
        booleanSet.add(true);
        booleanSet.add(false);
        booleanSet.add(true);
        booleanSet.add(false);
        booleanSet.add(true);
        booleanSet.add(false);
        booleanSet.add(true);
        booleanSet.add(false)
        ;booleanSet.add(true);
        booleanSet.add(false);
        booleanSet.add(true);
        booleanSet.add(false);

        System.out.println(0 % 16);
        System.out.println(1 % 16);



        fruitSet.add("Apple");

        System.out.println("Apple".hashCode());;

        int bucket = "Apple".hashCode() % 16;
        System.out.println(bucket);

        System.out.println("Apple".hashCode() % 16);
        System.out.println("Banana".hashCode() % 16);
        System.out.println("Orange".hashCode() % 16);
        System.out.println("Grapes".hashCode() % 16);
        System.out.println("Grapes".hashCode() % 16);
        System.out.println("Grapes".hashCode() % 16);
        System.out.println("Grapes".hashCode() % 16);
        System.out.println("Kiwi".hashCode() % 16);
        System.out.println("Drogon Fruit".hashCode() % 16);

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(500);
        integerSet.add(10);
        integerSet.add(85);
        integerSet.add(50);

        System.out.println(85 % 16);

        "Apple".equals("Apple");
        "Apple".equals("Pear");//new Node

        System.out.println("HashSet: " + fruitSet);

        Student student1 = new Student("Bharath", 28);
        Student student2 = new Student("Bharath", 28);
        Student student3 = new Student("Bharath", 28);
        Student student4 = new Student("Bharath", 28);
        Student student5 = new Student("Bharath", 28);
        Student student6 = new Student("Bharath", 29);

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());
        System.out.println(student4.hashCode());
        System.out.println(student5.hashCode());

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);
        studentSet.add(student5);
        studentSet.add(student6);

        System.out.println(studentSet.size());

    }
}
