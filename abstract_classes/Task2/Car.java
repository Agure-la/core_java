package Task2;

public class Car extends Vehicle {

    public Car(String make, String model) {
        super(make, model);
    }

    public void drive() {
        System.out.println("Driving " + make + " " + model);
    }

    public void park() {
        System.out.println("Parking " + make + " " + model);
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla");
        car.startEngine();
        car.drive();
        car.park();
    }
}
