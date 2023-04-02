
/*
This class contains task 2 and task 3
 */
public class Task3 {

    boolean areEqual;
    int number1 = 50;

    int number = 50;

    public boolean areEqual(int number1, int number){
        if (number1 == number){
            areEqual = true;
            System.out.println(areEqual);
        }
        else {
            areEqual = false;
            System.out.println(areEqual);
        }
        return areEqual;
    }
}
