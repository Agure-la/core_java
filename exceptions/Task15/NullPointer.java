package Task15;

public class NullPointer {
    void showNullPointer(){
        String s = null;
        try {
            s.length();
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
