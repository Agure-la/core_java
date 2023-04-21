package Task4;

public class MyClass {

    private int x;
    private String message;

    // Constructor with no arguments
    public MyClass() {
        x = 0;
        message = "Hello";
    }

    // Constructor with one argument of type int
    public MyClass(int x) {
        this.x = x;
        message = "Hi";
    }

    // Method with return type int
    public int calculateSum(int a, int b) {
        return a + b;
    }

    // Method with return type String
    public String getMessage() {
        return message;
    }
}
