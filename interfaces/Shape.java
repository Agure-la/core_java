public class Shape implements Rectangle, Square{
    @Override
    public void getArea() {
        int area = l * w;
    }

    //TASK5 method with one implementation from the 2 interfaces
    @Override
    public void getPerimeter() {
      int perimeter = 2 * (length + length);
    }

    //no implementation of display for task6
}
