//check if number is even or odd using switch
public class Task11 {

    int num1=100;
public void evenOdd(){
     switch(num1%2) {//this will return 0
         case 0:
             System.out.println(num1 + " is an Even number");
             break;
         case 1:
             System.out.println(num1 + " is an Odd number");
     }
     }
}
