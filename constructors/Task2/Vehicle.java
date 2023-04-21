package Task2;

public class Vehicle {


    private String make;
    private String model;

    // Default constructor
    public Vehicle() {
        this.make = "unknown";
        this.model = "unknown";
    }

    // Two argument constructor
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Getter methods
    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

}
