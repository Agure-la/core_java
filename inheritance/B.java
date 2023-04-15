
//B is a subclass of
public class B extends A{
    protected boolean hasEngine;
    protected int seatingCapacity;
    protected boolean isConvertible;

    public B(int numberOfWheels, String color, int maxSpeed, boolean hasEngine,
             int seatingCapacity, boolean isConvertible) {
        super(numberOfWheels, color, maxSpeed);
        this.hasEngine = hasEngine;
        this.seatingCapacity = seatingCapacity;
        this.isConvertible = isConvertible;
    }

    public void honkHorn() {
        System.out.println("Honk honk!");
    }

    public void adjustSeat() {
        System.out.println("Adjusting seat...");
    }

    @Override
    public String toString() {
        return super.toString() + " Has engine: " + hasEngine + ", seating capacity: " + seatingCapacity + ", is convertible: " + isConvertible;
    }
}
