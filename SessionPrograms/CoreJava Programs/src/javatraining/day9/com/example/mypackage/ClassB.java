package javatraining.day9.com.example.mypackage;

public class ClassB {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        System.out.println(a.packagePrivateField); // Accessing package-private field
        a.packagePrivateMethod(); // Accessing package-private method
    }
}
