package com.bharath.learning.springbasicexample.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrototypeMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PrototypeAppConfig.class);

        // Retrieve two different Prototype bean instances
        MyPrototypeBean prototypeBean1 = context.getBean(MyPrototypeBean.class);
        MyPrototypeBean prototypeBean2 = context.getBean(MyPrototypeBean.class);

        // Increment the counter in both instances
        prototypeBean1.incrementCounter();
        prototypeBean2.incrementCounter();

        // Print the counter value from both instances
        System.out.println("Counter in Bean 1: " + prototypeBean1.getCounter());
        System.out.println("Counter in Bean 2: " + prototypeBean2.getCounter());
    }
}
