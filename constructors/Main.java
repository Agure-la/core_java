import Task1.Calculation;
import Task2.Car;

public class Main {

    public static void main(String[] args) {

        //TASK1
        // Instantiate using default constructor
        Calculation calculation1 = new Calculation();
        System.out.println("num1: " + calculation1.getNum1() + ", str1: " + calculation1.getStr1());

        // Instantiate using one argument constructor
        Calculation calculation2 = new Calculation(42);
        System.out.println("num1: " + calculation2.getNum1() + ", str1: " + calculation2.getStr1());

        // Instantiate using two argument constructor
        Calculation calculation3 = new Calculation(42, "example");
        System.out.println("num1: " + calculation3.getNum1() + ", str1: " + calculation3.getStr1());

        //Tsk2
        // Instantiate using default constructor
        Car car1 = new Car();
        System.out.println("Make: " + car1.getMake() + ", Model: " + car1.getModel() + ", Number of doors: " + car1.getNumDoors());

        // Instantiate using two argument constructor
        Car car2 = new Car("Toyota", "Corolla");
        System.out.println("Make: " + car2.getMake() + ", Model: " + car2.getModel() + ", Number of doors: " + car2.getNumDoors());

        // Instantiate using three argument constructor
        Car car3 = new Car("Ford", "Mustang", 2);
        System.out.println("Make: " + car3.getMake() + ", Model: " + car3.getModel() + ", Number of doors: " + car3.getNumDoors());
    }
}
