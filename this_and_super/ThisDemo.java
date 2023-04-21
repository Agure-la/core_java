//TASK1
public class ThisDemo {

    private int x;
    private String name;

    public ThisDemo(int x, String name) {
        this.x = x;
        this.name = name;
        System.out.println("Instance created with values: x = " + this.x + ", name = " + this.name);
    }

    public void printFields() {
        System.out.println("x = " + this.x);
        System.out.println("name = " + this.name);
    }
}
