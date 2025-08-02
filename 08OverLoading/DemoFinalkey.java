// if you define the class as final you
// can't inheritate it or nor extend it
final class Demo{

    // if you declare a method final   it can't 
    // OVERRIDEN by its sub classes
    final void show(){
        System.out.println("Hello");
    }
}
 public class DemoFinalkey{
    public static void main(String[] args) {
        // if you declared the varible final you can change it value
        final int a = 10;

    }
}