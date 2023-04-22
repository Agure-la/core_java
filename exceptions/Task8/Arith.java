package Task8;

public class Arith {
    void show(){
        int numerator = 10;
        int denominator = 0;
        try {
            int result = numerator / denominator;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
