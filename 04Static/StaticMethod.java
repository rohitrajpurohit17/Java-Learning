class Mobile{
    int num =2;
    static int num2 = 3;
    public void met1(){
        System.out.println("I'm a method");
    }
    public static void met2(Mobile obj){
        System.out.println("I'm a static method");

        // to make this possible we have to pass object 
        System.out.println( obj.num + " " + num2);
    }
}
public class StaticMethod {
    public static void main(String[] args) throws ClassNotFoundException {
        
        Mobile mb = new Mobile();
        mb.met1();
        
        Mobile.met2(mb);
    }
}
