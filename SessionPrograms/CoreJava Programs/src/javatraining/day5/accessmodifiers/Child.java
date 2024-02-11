package javatraining.day5.accessmodifiers;

import javatraining.day5.com.example.ParentAccess;

public class Child extends ParentAccess {


    
    public static void main(String[] args) {
        Child child = new Child();
//         System.out.println(child.privateField);   // Not accessible due to private access
//         System.out.println(child.defaultField);   // Accessible within the same package
        System.out.println(child.protectedField); // Accessible due to inheritance
        System.out.println(child.publicField);    // Accessible from anywhere

//         child.privateMethod();   // Not accessible due to private access
//        child.defaultMethod();     // Accessible within the same package
        child.protectedMethod();   // Accessible due to inheritance
        child.publicMethod();      // Accessible from anywhere


       // child.privateField = "child name";

        child.setPrivateField("child name");

    }
}
