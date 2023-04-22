package Task5;

public class CustomExample {
    void display(){
        try {
            int age = 15;
            if(age < 18) {
                //throw custom message
                throw new Custom("You must be 18 or older to participate.");
            } else {
                System.out.println("Welcome to our program!");
            }
        } catch(Custom e) {
            // Print the custom exception message
            System.out.println(e.getMessage());
        }
    }
}
