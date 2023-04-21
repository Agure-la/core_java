package Task3.protectedConstructor;

public class Employee extends Person2{

    private String designation;
    public Employee(String name, int age, String designation) {
        super(name, age); // calling the protected constructor of the parent class
        this.designation = designation;
    }

}
