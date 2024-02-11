package com.bharath.learning.springbasicexample.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MySingletonBean.class);

        // Retrieve the Singleton bean
        MySingletonBean singletonBean1 = context.getBean(MySingletonBean.class);
        MySingletonBean singletonBean2 = context.getBean(MySingletonBean.class);

        // Increment the counter in both instances
        singletonBean1.incrementCounter();
        singletonBean2.incrementCounter();

        // Print the counter value from both instances
        System.out.println("Counter in Bean 1: " + singletonBean1.getCounter());
        System.out.println("Counter in Bean 2: " + singletonBean2.getCounter());
    }
}
