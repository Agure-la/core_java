package Task9;

public class IndexOutBound {

    void showOutBound(){
        int[] numbers = {1, 2, 3};
        try {
            int fourthNumber = numbers[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
