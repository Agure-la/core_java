package Task13;

public class NosuchField {

    void noField(){
        try {
            Class<?> clazz = Person.class;
            clazz.getField("salary");
        } catch (NoSuchFieldException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
