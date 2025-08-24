
abstract class A {

    abstract public void show();
}

public class UseOfAnonClassInAbsrtaction {

    public static void main(String[] args) {
        // Remeber we can't create the object of ABSTRACT class

        // Then how can we able to do this?
        A obj = new A() {//Actually the object is created of the 
            // Inner class not Abstract class As Anonymous class 
            // don't have name so we can create object with any name 

            public void show() {
                System.out.println("In Anonymous Class");
            }
        };
    }
}
