package Task1;

import Task1.Animal;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(name + " says meow!");
    }
}
