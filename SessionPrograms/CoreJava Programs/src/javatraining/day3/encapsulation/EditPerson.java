package javatraining.day3.encapsulation;

public class EditPerson {

    public static void main(String[] args) {
        Person person = new Person();

        person.setAge(10);
        person.setName("ABCD");

        Person person2 = new Person();

        System.out.println("Age: "+person.getAge() +" Name: " + person.getName());
    }
}
