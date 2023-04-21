//TASK8
public interface Circle {

    int radius = 7;

   void Area();

   default void displayRadius(){
       System.out.println(radius);
   }
}
