
public class StringBuffering {
    public static void main(String[] args) {
        // StringBuffer and StringBuilder are muatable type String 
        // Regular String is UNmutable type

        StringBuffer sb = new StringBuffer("Rohit");
        System.out.println(sb.capacity());
        // By default capicity is 16 
        // capacity and length are two different things 
    }
}
