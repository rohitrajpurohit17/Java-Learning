class Up{

}
class Down extends Up{

}
public class UpAndDownCasting {
    public static void main(String[] args) {
        //  Up Casting Parent class holding the Object of Child class
        Up up = new Down();
        
        // Down Casting child class holding the object of 
        // Parent class
        Down down = (Down)up;

    }
}
