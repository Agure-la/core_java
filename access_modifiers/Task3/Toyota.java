package Task3;

import Task3.Vehicle;

//subclass of vehicle with private fields
public class Toyota extends Vehicle {

    private String name;

    private int speed;


    public Toyota(String color, int year, String model, String name, int speed) {
        super(color, year, model);
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
