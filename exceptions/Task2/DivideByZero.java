package Task2;

//handled exception
public class DivideByZero {

    int a = 5;
    int b = 0;

    public int Division() {
        try {
            int c = a / b;
            System.out.println("Result :" + c);
        } catch (ArithmeticException e) {
            System.out.println("An ArithmeticException occurred: " + e.getMessage());
        }
        return 0;
    }
}
