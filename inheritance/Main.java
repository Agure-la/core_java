public class Main {
    public static void main(String[] args) {
        A a = new A(4, "red", 100);
        B b = new B(4, "blue", 120, true,
                5, false);
        C c = new C(4, "green", 150, true,
                4, true, true, "gasoline", 2022);

        a.accelerate();
        a.brake();
        System.out.println(a.toString());

        b.accelerate();
        b.brake();
        b.honkHorn();
        b.adjustSeat();
        System.out.println(b.toString());

        c.accelerate();
        c.brake();
        c.honkHorn();
        c.adjustSeat();
        c.openSunroof();
        c.startEngine();
        System.out.println(c.toString());

        //calling overridden method of super class with reference to b
        A bAsA = b;
        bAsA.accelerate();
        bAsA.brake();
        System.out.println(bAsA.toString());

        //calling overridden method of super class with reference to c
        A cAsA = c;
        cAsA.accelerate();
        cAsA.brake();
        System.out.println(cAsA.toString());
    }
}
