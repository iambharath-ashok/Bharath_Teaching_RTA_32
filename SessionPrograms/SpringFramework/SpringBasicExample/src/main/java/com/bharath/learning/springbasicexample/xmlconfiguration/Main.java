package com.bharath.learning.springbasicexample.xmlconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load the Spring context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the "person" bean from the Spring context
        Person person = context.getBean("person", Person.class);

        // Display person information
        System.out.println("Person Information:");
        System.out.println(person);
    }
}
