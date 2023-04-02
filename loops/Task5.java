//print the largest number
public class Task5 {

    private int[] numbers = {8, 12, 98};

    int largest = numbers[0];
    public void largestNumber(){
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
                //System.out.println("Largest :" + largest);
            }
            System.out.println("Largest :" + largest);
        }
    }
}
