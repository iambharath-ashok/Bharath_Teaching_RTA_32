package com.bharath.learning.springbasicexample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DemoSpringConfiguration {

    @Bean
    public String bharath() {
        return "Bharath Ashok";
    }

    @Bean
    public int age(){
        return 27;
    }

    @Bean
    @Qualifier("bharath")
    public Person person() {
        Person person = new Person("bharath", 27, null);
        return person;
    }

    @Bean
    @Primary
    @Qualifier
    public Person person2() {
        Person person = new Person(bharath(), age(), null);
        return person;
    }

    @Bean
    public Person person3(String bharath, int age, Address address) {
        Person person = new Person(bharath, age, address);
        return person;
    }

    @Bean
    public Address address() {
        Address address = new Address("MG Road", "Bangalore");
        return  address;
    }
}

record Person(String name, int age, Address address) {}

record Address(String street, String city) {}
