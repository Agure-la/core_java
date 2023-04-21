package Task2;

//TASK2
public class Car extends Vehicle {

    private int numDoors;

    // Default constructor
    public Car() {
        super(); // Call default constructor of Vehicle class
        this.numDoors = 4; // Set default value for number of doors
    }

    // Two argument constructor
    public Car(String make, String model) {
        super(make, model); // Call two argument constructor of Vehicle class
        this.numDoors = 4; // Set default value for number of doors
    }

    // Three argument constructor
    public Car(String make, String model, int numDoors) {
        super(make, model); // Call two argument constructor of Vehicle class
        this.numDoors = numDoors;
    }

    // Getter method
    public int getNumDoors() {
        return this.numDoors;
    }
}
