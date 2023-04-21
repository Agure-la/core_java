//TASK2
public class Car extends Vehicle {

    private int numDoors;
    private String color;
    private String transmissionType;


    //this Constructor contains TASK3, TASK4, TASK5 AND TASK6
    public Car(String make, String model, int year, String fuelType,
               int numDoors, String color, String transmissionType) {
        //how to use super
        super(make, model, year, fuelType);
        this.numDoors = numDoors;
        this.color = color;
        this.transmissionType = transmissionType;
    }

    //call

    public void printCarInfo() {
        //how to use super
        super.printVehicleInfo();
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Color: " + color);
        System.out.println("Transmission Type: " + transmissionType);
    }
}
