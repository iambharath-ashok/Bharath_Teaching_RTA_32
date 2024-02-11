package javatraining.day4.superandthis;


//Super

class Parent {

    protected String name;
    protected int age;

    Parent(){
        System.out.println("Default Constructor");
    }

    Parent(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void iamGoodParent() {
        System.out.println("Good Parents");
    }

}


class Child extends  Parent {

    private String name;
    private int age;

    Child(String name, int age){
        super(name, age);// Super Keyword for :: Constructor Invocation or Chaining
        this.age = age;
        this.name = name;
    }

    public void method1() {
        System.out.println(super.age); // Super Keyword for:: Field Reference
        System.out.println(this.age);
        super.iamGoodParent(); // Super Keyword For :: Method Invocation
    }






}

public class Runner {

    public static void main(String[] args) {

        //Child child = new Child("Cena", 30);

        doWhileLoop();


    }


    private static void doWhileLoop() {
        int i = 0, num= 50;

        System.out.println("Even numbers:");

        do {
            // Check if the current number is even
            if (i % 2 == 0) {
                System.out.println(i);
            }

            // Increment the counter
            i++;
        } while (i <= num);



    }
}


