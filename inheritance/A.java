
//A is a super class that represents Vehicle attributes
public class A {
    protected int numberOfWheels;
    protected String color;
    protected int maxSpeed;

    public A(int numberOfWheels, String color, int maxSpeed) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void accelerate() {
        System.out.println("Accelerating...");
    }

    public void brake() {
        System.out.println("Braking...");
    }

    @Override
    public String toString() {
        return "Vehicle with " + numberOfWheels + " wheels, color " + color + ", and max speed " + maxSpeed + " km/h.";
    }
}
