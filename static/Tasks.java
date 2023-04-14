
//class with static variable, static method , instance variable, instance method and main method
public class Tasks {
    static String name = "my name is Joan";
    static int age = 22;

    public double salary = 21332;

    public char gender = 'M';

    public void setSalaryIn(double salary1){
        salary1 = salary;
    }
    static void printName(){
        System.out.println("Name : " + name);
    }

    static void printAge(){
        System.out.println("Age : "+ age);
    }

    public void printSalary(){
        System.out.println("Salary :" + salary);
    }

    public void printGender(){
        System.out.println("Gender : " + gender);
    }

    //print instance variable inside a static method
     static void instanceVariable (Tasks tasks){
        double finalAnswer = tasks.salary;
        System.out.println(finalAnswer);
     }

     //print static variable inside instance method
    public void staticVariable(){
        System.out.println(age);
    }

    //call instance method inside static method
    static void callInstance(Tasks tasks){
         tasks.printSalary();
    }

    //call static method inside instance method
    public void callStatic(){
        printAge();
    }
    public void main(String[] args)
    {
        printName();
        printAge();
        printSalary();
        printGender();

    }
}
