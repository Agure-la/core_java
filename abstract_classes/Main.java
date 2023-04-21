import Task1.Animal;
import Task1.Cat;
import Task1.Dog;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Puppy", 2);
        Animal cat = new Cat("Smally", 4);

        dog.eat();
        dog.makeSound();

        cat.eat();
        cat.makeSound();
    }
}
