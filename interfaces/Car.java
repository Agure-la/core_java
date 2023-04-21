//TASK9 and 10
public class Car extends Vehicle implements Vehicle.Maintenance{
    public Car(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void oilChange() {
        System.out.println("Oil change");
    }

    @Override
    public void tireRotation() {
        System.out.println("Tire Rotation");
    }

    @Override
    public void brakeInspection() {
        System.out.println("Brake Inspection");
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
