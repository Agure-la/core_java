package Task3_4;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public void printArea() {
        System.out.println("The area of the rectangle is " + area());
    }

    public void printDoubleArea() {
        Rectangle r = new Rectangle(2 * length, 2 * width);
        System.out.println("The area of the doubled rectangle is " + r.area());
    }

    public void printDimensions() {
        System.out.println("Length: " + length + ", Width: " + width);
    }

    public void printDoubleDimensions() {
        Rectangle r = new Rectangle(2 * length, 2 * width);
        System.out.print("Doubled dimensions: ");
        r.printDimensions();
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(3, 4);
        r.printArea();
        r.printDoubleArea();
        r.printDimensions();
        r.printDoubleDimensions();
    }
}
