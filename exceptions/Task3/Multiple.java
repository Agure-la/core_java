package Task3;

public class Multiple {
void showExceptions() {
    try {
        int[] numbers = {1, 2, 3};
        //out of bound exception
        System.out.println(numbers[3]);
        //arithmetic exception
        int result = 10 / 0;
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("An ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
    } catch (ArithmeticException e) {
        System.out.println("An ArithmeticException occurred: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("An exception occurred: " + e.getMessage());
    }
}
}
