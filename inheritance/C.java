public class C extends B{
    protected boolean hasSunroof;
    protected String fuelType;
    protected int modelYear;

    public C(int numberOfWheels, String color, int maxSpeed,
             boolean hasEngine, int seatingCapacity, boolean isConvertible,
             boolean hasSunroof, String fuelType, int modelYear) {
        super(numberOfWheels, color, maxSpeed, hasEngine, seatingCapacity, isConvertible);
        this.hasSunroof = hasSunroof;
        this.fuelType = fuelType;
        this.modelYear = modelYear;
    }

    public void openSunroof() {
        System.out.println("Opening sunroof...");
    }

    public void startEngine() {
        System.out.println("Starting engine...");
    }

    @Override
    public String toString() {
        return super.toString() + " Has sunroof: " + hasSunroof + ", fuel type: " + fuelType + ", model year: " + modelYear;
    }
}
