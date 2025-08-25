// An interface in Java is like a contract or blueprint that defines
//  what methods a class must have,
//  but doesn't provide the actual implementation. 

// Interface is declare with keyword interface same as class 
// it works like abstract class
interface  A{
    // vairble declared must be initialized 
    // becoz the Vaibles are BY DEFAULT
    // Static and final
    int age = 30;

    // methods are declare int such way becoz 
    // they are by default 
    // PUBLIC AND ABSTRACT so there no need to 
    // write like public abstract void().....

    void show();

}
interface X{
    void display();
}
// You have to impelement the interface with implement keyword 
class B implements A,X{

    public void show(){
        System.out.println("Show...");
    }
    public void display(){
        System.out.println("Displayyy");
    }


}
public class InterfacesExplain {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();

        X obj1 = new B();
        obj1.display();

        // because varible is static so object is not required
        System.out.println(A.age);


    }
}
