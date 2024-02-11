package javatraining.day6.staticexamples;

public class StaticMemoryAllocation {
    // Static field shared among all instances of StaticMemoryAllocation
    //Memory will be allocated by JVM while loading the class
    public static int staticField = 10;// Memory will assigned on the class area or method area
    public static int staticVariable2 = 90;// Memory will assigned on the class area or method area

    // Instance field
    public int instanceField;// Heap Memory

    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Instance method
    public void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    public static void main(String[] args) {
        // Accessing static members without creating an instance
        System.out.println(StaticMemoryAllocation.staticField); // Outputs: 10
        StaticMemoryAllocation.staticMethod(); // Outputs: This is a static method.

        // Creating instances and accessing instance members
        StaticMemoryAllocation obj1 = new StaticMemoryAllocation();
        StaticMemoryAllocation obj2 = new StaticMemoryAllocation();

        obj1.instanceField = 20;
        obj2.instanceField = 30;

        System.out.println(obj1.instanceField); // Outputs: 20
        System.out.println(obj2.instanceField); // Outputs: 30

        obj1.instanceMethod();
        obj2.instanceMethod();
    }
}
