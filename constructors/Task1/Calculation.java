package Task1;

//TASK1
public class Calculation {

    private int num1;
    private String str1;

    // Default constructor
    public Calculation() {
        this.num1 = 0;
        this.str1 = "default";
    }

    // One argument constructor
    public Calculation(int num1) {
        this.num1 = num1;
        this.str1 = "default";
    }

    // Two argument constructor
    public Calculation(int num1, String str1) {
        this.num1 = num1;
        this.str1 = str1;
    }

    // Getter methods
    public int getNum1() {
        return this.num1;
    }

    public String getStr1() {
        return this.str1;
    }
}
