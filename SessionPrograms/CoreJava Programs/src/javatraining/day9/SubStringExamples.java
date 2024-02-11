package javatraining.day9;

public class SubStringExamples {

    public static void main(String[] args) {



        String original = "Hello, World!";
        String substring = original.substring(7);

        System.out.println(substring); // Output: "World!"

        //String original = "Hello, World!";
       // String substring = original.substring(7, 12);

//        System.out.println(substring); // Output: "World"

       // String original = "Hello, World!";
       // String prefix = original.substring(0, 5);

       // System.out.println(prefix); // Output: "Hello"

        //String original = "Hello, World!";
       // String substring = original.substring(original.length() - 6);

//        System.out.println(substring); // Output: "World!"



        String hello = "Hello";
        try {
            String substringhello = hello.substring(10);
            System.out.println(substringhello);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }


    }
}
