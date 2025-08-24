class A{
    public void show(){
        System.out.println("In A Class");
    }
}

public class AnonymousInClassDemo {
public static void main(String[] args) {
    // This our ANONYMOUS CLASS 
    // It is written here without creating a class 
    // Just exact after creating object of class in currly brackets

    A obj = new A(){ //here with this bracket it creating inner class
        // as it is inner class and doesn't have Name
        // its is known as AnonymousCLass

        // Anonymous class is Required when you are using a class 
        // Just once that the class is required only for one time

        @Override
        public void show(){//Basiclly it is overriding the 
            // method of original class 
        System.out.println("In Anonymous Class");
    }
    };//make sure to end with semi colns

    obj.show();
}    
}
