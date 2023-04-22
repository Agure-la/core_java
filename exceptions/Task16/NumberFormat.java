package Task16;

public class NumberFormat {

    void showNUmberFormat(){
        String s = "123a";
        try {
            int i = Integer.parseInt(s);
            System.out.println("Parsed integer: " + i);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
