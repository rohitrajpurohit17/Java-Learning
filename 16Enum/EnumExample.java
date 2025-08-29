// enum are use as Status like to know states 
// it conatins Running, Failed, Pending, Success
// This are Not String or Integer we use it at the place of 
// String messages 

// Rather taking class we take enum for it 
enum  Status{
    Running, Failed, Pending, Success;
    // 0        1       2       3
}

public class EnumExample {
    public static void main(String[] args) {
        int i = 5;
        // Rather than using String for message 
        // we used enum 
        Status s = Status.Running;

        // to get All status at a time 
        Status[] ss = Status.values();
        System.out.println(s);
        // we use s.ordinal to get it number like index

        for(Status a : ss){
            System.out.println(a + " : " + a.ordinal());
        }

    }
    
}
