public class Main {
    public static void main(String[] args) {
        Calculator calc = new Compute();
        //TASK3 Interface instance to call implemented method
        int difference = calc.subtract(7, 2);
        System.out.println("Difference: " + difference);

        //TASK4
        Shape shape = new Shape();
        shape.getArea();
        shape.getPerimeter();
        //TASK6 call an implemented method
        shape.display();
    }
}
