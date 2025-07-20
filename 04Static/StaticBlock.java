class Mobile{
    Mobile(){
        System.out.println("I am Constructor");
    }

    static {
        System.out.println("I am Static Block");
    }
}
public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
        // Here is example contrructor will be print two time 
        // and Static block will excute only one time
        // Mobile mb = new Mobile();
        // Mobile mb1 = new Mobile();

        // Another way to load a class
        // but we have to add throws to handle exception
        Class.forName("Mobile");
    }
}
