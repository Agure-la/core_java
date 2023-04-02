//even numbers between 10 to 100
public class Task6 {

    int number = 100;

    public void evenNumbers() {
        for (int i = 10; i <= number; i++) {
          if (i%2==0){
              System.out.println(i);
          }
        }
    }
}
