package Task10;

public class ClassNotFound {
    void showClassNotFound(){
        try {
            Class.forName("com.example.kks");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
