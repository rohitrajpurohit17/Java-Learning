// Abstract class is define with abstract key word 
// There is no compulsion that abstract class must conatin
// abstract method is not required 

// Most important abstract class we CANNOT create the object 
// of Abstract class
abstract class Car{
    // To create the abstract method we to just delcare it 
    // NOt to initialize it 
    // As shown below
    abstract void drive();

    // we can also create other method in abstract class
    void playMusic(){
        System.out.println("Playing music ");
    }

}

// To call the Abstract class method you need to create 
// Another class to call the method of abstract class
// You cna only Extend one Abstract class at a time
class BMW extends Car{
    // if a class is extends Abstract class then it must 
    // insialise the abstarct method created in abstarct class
    // it's compulsory

    void drive(){
        System.out.println("Drive car....");
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {
        // so we can't create the object of abstract class
        //  now we craete the obeject of class that extends it 
        Car c = new BMW();
        // Both are right
        // BMW c = new BMW();
        c.drive();
        c.playMusic();
        
    }
}