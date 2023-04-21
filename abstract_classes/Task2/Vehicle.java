package Task2;

public abstract class Vehicle {

    protected String make;
    protected String model;
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void startEngine() {
        System.out.println("Starting engine of " + make + " " + model);
    }

    public abstract void drive();
}
