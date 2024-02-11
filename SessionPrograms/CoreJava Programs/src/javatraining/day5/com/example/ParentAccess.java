package javatraining.day5.com.example;



class Person {

    private String name;
    private String dob;
    private String location;
    private String email;





}
public class ParentAccess {

    private String privateField;
    int defaultField = 20;
    protected int protectedField = 30;
    public int publicField = 40;

    private void privateMethod() {
        System.out.println("Private method");
    }

    void defaultMethod() {
        System.out.println("Default method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    public void publicMethod() {
        System.out.println("Public method");
    }


    //person --> mobile app --> Person Class--> bank account --> server (DB)

    public String getPrivateField() {
        return privateField;
    }

    public void setPrivateField(String privateField) {

        //Password validation
        // Authorization
        //valid token

        this.privateField = privateField;


    }

}
