// class to claa --> extends
// interface to class --> implemnets
// interface to interface --> extends


// An interface in Java is like a contract or blueprint that defines
//  what methods a class must have,
//  but doesn't provide the actual implementation. 

// Interface is declare with keyword interface same as class 
// it works like abstract class
interface  A{
    // vairble declared must be initialized 
    // becoz the Veriables are BY DEFAULT
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
    // You have to initialize all the method 
    // from the  both class You are implementing
    // otherwise gonna throw error
    public void show(){
        System.out.println("Show...");
    }
    public void display(){
        System.out.println("Displayyy");
    }


}
public class InterfacesExplain {
    public static void main(String[] args) {
        A obj;//You can't create the object of interface 
        // as it aslo work like abstract 
        obj = new B();//so another class is created and implements the 
        // interface and we use the object of that class
        obj.show();


        // If you are implementing two interfaces  than you 
        // have to take that other ones refferce to call the 
        // method of that Interface 
        X obj1 = new B();
        obj1.display();

        // because varible is static so object is not required
        System.out.println(A.age);


    }
}
