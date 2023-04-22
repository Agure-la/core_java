package Task17;

public class StringOutOfBound {
    void outOfBound(){
        String s = "Hello, World!";
        try {
            char c = s.charAt(15);
            System.out.println("Character at index 15: " + c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
