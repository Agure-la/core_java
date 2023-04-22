import Task1.Divide;
import Task2.DivideByZero;
import Task6.User;
import Task6.UserDatabase;
import Task6.UserNotFoundException;

public class Main {
    public static void main(String[] args) {

        Divide divide = new Divide();
        System.out.println("Result: " + divide.divide());

        DivideByZero task2 = new DivideByZero();
        System.out.println(task2.Division());

        UserDatabase db = new UserDatabase();
        try {
            User user = db.findUserByName("David");
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        } catch(UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
