package Task1;

import Task1.Animal;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(name + " says woof!");
    }
}
