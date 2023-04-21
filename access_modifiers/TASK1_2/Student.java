package TASK1_2;

import TASK1_2.Person;

//class with default variables
public class Student extends Person {

    //default variables
    String course = "Diploma in Finance";
    String regNo = "Sit215-C4";

    public Student(String name, int age, String course, String regNo) {
        super(name, age);
        this.course = course;
        this.regNo = regNo;
    }

    void displayStudentsDetails(){
        System.out.println(getName());
        System.out.println(getAge());
    }
}
