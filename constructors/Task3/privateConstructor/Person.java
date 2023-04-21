package Task3.privateConstructor;

//Task3
public class Person {

    private String name;
    private int age;

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // public method to create objects of the class
    public static Person createPerson(String name, int age) {
        return new Person(name, age);
    }

}
