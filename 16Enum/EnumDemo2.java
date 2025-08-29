enum  Status{
    Running, Failed, Pending, Success;
   
}
// You can't Extend enum class Other Things are SAME
// enum Extends a JAVA SuperCLASS that is Enum 
// [java.lang.Enum]

public class EnumDemo2 {
    public static void main(String[] args) {

        Status s = Status.Failed;

        // How we use enum with Conditions 
        // if-else and Switch
        switch(s){
            case Running : System.out.println("Let's Goo");
            break;
            case Failed : System.out.println("Wasted");
            break;
            case Pending : System.out.println("It's goes oon and on");
            break;
            default: System.out.println("Mission Succesfull");
        }

        if(s == Status.Running){
            System.out.println("Gooing On..");
        }else if(s == Status.Failed){
            System.out.println("Try Again");
        }else if(s == Status.Pending){
            System.out.println("Wait More");

        }else{
            System.out.println("Work Done");
        }

    }    
}
