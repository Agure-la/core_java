public class Main {
    public static void main(String[] args){

        Print displayName = new Print();
        displayName.printName("Odeny Kagure");

        Task2 values = new Task2();
        values.displayVariables(values.getNumber(), values.isAnswer(), values.getVowel(), values.getNumber1(), values.getNumber2());

        Task5 localAndGlobalVariable = new Task5();
        //print global variable
        System.out.println(localAndGlobalVariable.getName());
        //print local variable
        localAndGlobalVariable.localVariable();

    }
}
