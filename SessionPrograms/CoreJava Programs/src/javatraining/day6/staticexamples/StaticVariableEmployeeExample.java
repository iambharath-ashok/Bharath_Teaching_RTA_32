package javatraining.day6.staticexamples;

class Employee {
 
    int id;
    String name;
    static String organization = "Facing Issues On IT";
 
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
 
    public String display() {
        return "Id:" + id + " Name:" + name + " Organization:" + organization;
    }
}
public class StaticVariableEmployeeExample {
 
    public static void main(String[] args) {
        Employee e1=new Employee(1,"Saurabh Gupta");
        Employee e2=new Employee(2,"Gaurav Kumar");
 
        System.out.println(e1.display());
        System.out.println(e2.display());
        //Change Static value
        Employee.organization="Learn from Others Experience";//Print before change
        System.out.println(e1.display());
        System.out.println(e2.display());
    }
 
}