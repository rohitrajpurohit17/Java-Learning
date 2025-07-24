class A {
   public void show(){
     System.out.println("In A Class");
   }
}

class B extends A{
    public void show(){
        System.out.println("In B class");
        
    //    use call parent class method
    //    super.show();
    }
    
    // Overriding Can't be done in same class
    // public void show(){

    // }
}

public class OverridingEx {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
