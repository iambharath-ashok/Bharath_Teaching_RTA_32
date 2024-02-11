package javatraining.day5.interfaces;

// Animal implementation
class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats bones");
    }
}

class Cat implements Animal {

    @Override
    public void sound() {
        System.out.println("cat meo");
    }

    @Override
    public void eat() {
        System.out.println("cat eats");
    }
}

class Human implements Animal {

    @Override
    public void sound() {
        System.out.println("Human speaks");
    }

    @Override
    public void eat() {
        System.out.println("Human eats");
    }
}
