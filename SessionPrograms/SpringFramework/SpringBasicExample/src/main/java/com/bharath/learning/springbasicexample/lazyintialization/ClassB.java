package com.bharath.learning.springbasicexample.lazyintialization;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ClassB {

    private ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("Lazy Initialization Exapnle");
        this.classA = classA;
    }
}
