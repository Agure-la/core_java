import Tasks.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum1 = calc.add(2, 3);           // Calls the first method
        int sum2 = calc.add(2, 3, 4);        // Calls the second method
        double sum3 = calc.add(21.43, 3423, 212.90, 34.988);
        int dif = calc.subtract(7, 3);

        System.out.println("Sum1: " + sum1); // Prints "Sum1: 5"
        System.out.println("Sum2: " + sum2); // Prints "Sum2: 9"
        System.out.println("Sum3: " + sum3);
        System.out.println("Sum3: " + dif);
    }
}
