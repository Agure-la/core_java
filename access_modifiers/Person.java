//class with private variables
public class Person {

    private String name = "Joy Chloe";
    private int age = 20;
    double salary = 30000;
    char gender = 'F';
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPrivateVariables(){
        System.out.println(name);
        System.out.println(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
