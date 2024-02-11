package com.bharath.learning.springbasicexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


public class SpringBasicExampleApplication {

    public static void main(String[] args) {

        //1. Initialize the Spring Context and
        //2. Configure the beans what we want spring to manage
        //3. Get the beans from Spring Context or Container

        var annotationConfigApplicationContext = new AnnotationConfigApplicationContext(DemoSpringConfiguration.class);
        System.out.println(annotationConfigApplicationContext.getBean("bharath"));
        System.out.println(annotationConfigApplicationContext.getBean(Person.class));


        Arrays.stream(annotationConfigApplicationContext.getBeanDefinitionNames())
                .forEach(System.out::println);
  }

}
