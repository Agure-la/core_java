import TASK1_2.Person;
import TASK1_2.Student;

public class Main {
    public static void main(String args[])
    {
     Person person = new Person("Joy Chloe", 23);
     System.out.println(person.getName());
        System.out.println(person.getAge());
        person.displayPrivateVariables();

        Student student = new Student("Will", 30, "SCIT", "SCIT548C");
        System.out.println(student.course);
        System.out.println(student.regNo);

    }
}
