import java.util.Arrays;

//Add integer values of an array
//get average of integers in array
//contains TASK1 AND TASK2
public class Task1 {

    int[] numbers = {1, 2, 3,32,10,8,17};

    //TASK1
    public void add(){
        int sum = 0;
        for (int i = 1; i <= numbers.length; i++){
            sum+=i;
        }
        System.out.println(sum);
    }

    //TASK2
    public void average(){
        int sum = 0;
        double average = 0;
        for (int i = 1; i<=numbers.length; i++){
            sum+=i;
            average = sum/numbers.length;
        }
        System.out.println(average);
    }

    //TASK3
    public static int findIndex(int arr[], int t)
    {

        // if array is Null
        if (arr == null) {
            return -1;
        }

        // find length of array
        int len = arr.length;
        int i = 0;

        // traverse in the array
        while (i < len) {

            // if the i-th element is t
            // then return the index
            if (arr[i] == t) {
                System.out.println("Index is at : " + i);
                return i;
            }
            else {
                i = i + 1;
                //System.out.println("Index is at : " + i);
            }
        }
        //System.out.println("Index is at : " + i);
        return -1;
    }

    //TASK4
    public void findValue(int arr[], int toFind) {

        boolean found = false;

        for (int n : arr) {
            if (n == toFind) {
                found = true;
                break;
            }
        }
        if(found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");
    }

    //TASK6
    public void copyArray(){
        int[] arr = {5, 4, 3, 2, 1};
        int[] copyArr = new int[arr.length];

        //For loop to copy the content of array 'arr' to array 'copyArr'
        for(int i = 0; i<arr.length; i++)
            copyArr[i] = arr[i];

        System.out.println("The original array is: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println("\n\nContents of the copied array is");
        for (int i = 0; i < copyArr.length; i++)
            System.out.print(copyArr[i] + " ");
    }

    //TASK7
    public void removeElement(){
        int[] arr = new int[]{1,2,3,4,5};
        int[] arr_new = new int[arr.length-1];
        int j=3;
        for(int i=0, k=0;i<arr.length;i++){
            if(i!=j){
                arr_new[k]=arr[i];
                k++;
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(arr_new));
    }

    //Task8
    public void getMax(){
        int[] array = {23, 67, 23, 45,32,56};
        int max = 0;

        for(int i=0; i<array.length; i++ ) {
            if(array[i]>max) {
                max = array[i];
            }
        }
        System.out.println("Maximum value is :" + max);
    }

    //Task8
    public void getMin(){
        int[] array = {23, 67, 23, 45,32,56,12};
        int min = array[0];

        for(int i=0; i<array.length; i++ ) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        System.out.println("Minimum value is :" + min);
    }

    //TASK9
    public void reverseArray(int[] array){
        for(int i=array.length-1;i>=0;i--) {
            System.out.print( array[i] + " ");
        }
        System.out.println();
    }

    //TASK10
    public void duplicateValue(){
        int[] array = {23, 56, 8, 90, 76,8};
        int i,j;
        for (i = 0; i<array.length;i++){
            for (j=i+1;j<=i;j++){
                if (array[i]==array[j]){
                    System.out.println("Duplicate found:" + array[i]);
                }
                else {
                    System.out.println("No duplicate");
                }
            }
        }
    }

    //TASK11
    public void commonInArrays(){
        int[] array1 = {1, 2, 5, 5, 3, 9, 7, 10};
        int[] array2 = {1, 0, 6, 3, 6, 4, 7, 0};

        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i] == (array2[j]))
                {

                    System.out.println("Common element is : "+(array1[i]));
                }
            }
        }
    }

    //TASK12
    public static int removeDuplicates(int arr[], int count){
        if (count==0 || count==1){
            return count;
        }
        // creating a temporary array to hold non-duplicate elements
        int[] temp = new int[count];
        int j = 0;
        for (int i=0; i<count-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[count-1];
        // copying the temp array to the original array
        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return j;
    }

    //TASK13/14
    public static int getSecondLargest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-2];
    }

    //task15
    public void numberOfEvenOdd(){
        int[] arr = {12, 13, 24, 15, 17,24,13};
        int i,i1 = 0,i2 = 0;
        int oddCount = 0, evenCount =0;
        for (i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                 i1 = oddCount++;
            }
            else {
                 i2 = evenCount++;
            }
        }
        System.out.println("Odd :" + i1);
        System.out.println("Even :" + i2);
    }

    //TASK16
    public void differenceMinMax(){
        int[] array_nums = {5, 7, 2, 4, 9};
        System.out.println("Original Array: "+Arrays.toString(array_nums));
        int max_val = array_nums[0];
        int min = array_nums[0];
        for(int i = 1; i < array_nums.length; i++)
        {
            if(array_nums[i] > max_val)
                max_val = array_nums[i];
            else if(array_nums[i] < min)
                min = array_nums[i];
        }
        System.out.println("Difference between the largest and smallest values of the said array: "+(max_val-min));
    }

    //TASK17
    public boolean findTwoNumbersArray(int[] array_nums, int num1, int num2) {
        for (int number : array_nums) {
            boolean r = number != num1 && number != num2;
            if (r) {
                return false;
            }
        }
        return true;
    }

    //TASK18
    public static int removeduplicates(int a[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }

        temp[j++] = a[n - 1];

        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }

        return j;
    }

}
