package Task7;

public class FinallyBlock {

    void get(){
        User user = null;
        try {
            user = new User("Alice", 25);
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
            int result = 10 / 0;
        } catch(ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
            if(user != null) {
                System.out.println("User object is not null.");
            } else {
                System.out.println("User object is null.");
            }
        }
    }
}
