package TASK4;

//class with public fields and methods
public class Animal {

    public String name;

    public String color;

    public int noOfLegs;

    public Animal(String name, String color, int noOfLegs) {
        this.name = name;
        this.color = color;
        this.noOfLegs = noOfLegs;
    }

    public void displayInfo(){
        System.out.println(name);
        System.out.println(color);
        System.out.println(noOfLegs);
    }
}
