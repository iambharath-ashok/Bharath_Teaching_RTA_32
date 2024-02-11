package javatraining.day4;

public class DiamondProblem extends Object {
}

class Parent1 {

}

class Parent2{

}


class Child  {

}

interface A {
    default void m1() {

    }
}
interface B {
    default void m1() {

    }
}

class Child2 implements A,B {

    public void m1() {

    }
}
