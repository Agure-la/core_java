//print even and odd numbers

public class Task4 {

    private int[] array ={1,2,3,4,5,6,7,8,9,10};

    public void oddEven(){
    for(int j = 0; j < array.length; j++) {
        if (array[j] % 2 == 0) {
            System.out.println("even : " + array[j]);
        } else {
            System.out.println("Odd :" + array[j]);
        }
    }
    }


}
