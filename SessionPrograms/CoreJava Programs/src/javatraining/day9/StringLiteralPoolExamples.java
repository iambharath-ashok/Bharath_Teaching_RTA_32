package javatraining.day9;

public class StringLiteralPoolExamples {




    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello1";
        str1 = "Hello World";

        Object o1 = new Object();
        Object o2 = new Object();

        System.out.println("Str1: "+ str1.hashCode());
        System.out.println("Str2: "+ str2.hashCode());
        System.out.println(str1 == str2);

        String name1 = new String("bharath");
        String name2 = "bharath";
        name1 = name1.intern();
//
//        System.out.println(str1 == str2);

        String string1 = "Hello";
        String string2 = "World";
        String string3 = "HelloWorld";
        String string4 = string1 + string2;

        if(string3 == string4) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
//
//        str4 = str1.concat(str2).intern();
//
//        //str4 =  new String("HelloWorld");
//
//        System.out.println("String1: "+ str1 + " String2: "+str2);
//       System.out.println(str3 == str4);

        String hello1 = new String("Hello");
        String hello2 = new String("Hello");

        System.out.println(hello1 == hello2);

        str2 = "Hello";


    }
}
