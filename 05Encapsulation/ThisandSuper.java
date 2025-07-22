class A {
    public A(){
        System.out.println("A Default");
       
    }
    public A(int n){
        System.out.println("A parameterized");

    }
}

class B extends A{
    public B(){
        System.out.println("B Default");
        
        
    }
    public B(int n ){
        // to execute default constructor of self B
        this();
        // To executr the Parameretized Construtor of B 
        // super(n);
        System.out.println("B Parameretized");
    }
}

public class ThisandSuper {
    public static void main(String[] args) {
        B b = new B(5);
    }
}
