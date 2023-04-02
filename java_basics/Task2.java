public class Task2 {
//this task about variable declarations task 4 on the PDF;
    private int number = 5;
    private boolean answer = true;
    private char vowel = 'a';
    private float number1 = 5.0f;
    private double number2 = 2454.675;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    public char getVowel() {
        return vowel;
    }

    public void setVowel(char vowel) {
        this.vowel = vowel;
    }

    public float getNumber1() {
        return number1;
    }

    public void setNumber1(float number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public void displayVariables(int number, boolean answer, char vowel, float number1, double number2){
        System.out.println("Integer value is :" + "" + number);
        System.out.println("Integer value is :" + "" + answer);
        System.out.println("Integer value is :" + "" + vowel);
        System.out.println("Integer value is :" + "" + number1);
        System.out.println("Integer value is :" + "" + number2);
    }
}
