package Task14;

public class NoSuchMethod {

    void accessMethod(){
        try {
            Person.class.getMethod("displayDetailz");
        } catch (NoSuchMethodException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
