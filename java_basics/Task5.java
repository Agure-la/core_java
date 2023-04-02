public class Task5 {

    //this is a global variable
    public String name = "My name";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void localVariable(){

        //this is a local variable
        String name = "My name";
        System.out.println(name);
    }
}
