class Mobile{
    String mobile;
    int price;
    static String type;

    public void show(){
        System.out.println(mobile+" : " + price+" : " + type);
    }
}
public class StaticEx {
    public static void main(String[] args) {
        Mobile mb = new Mobile();
        mb.mobile ="samsung";
        mb.price = 25000;
        Mobile.type = "Smartphone";

        Mobile mb2 = new Mobile();
        mb2.mobile ="Apple";
        mb2.price = 30000;
        Mobile.type = "Smartphone";
        // We have to call static varible with class name not with obj 
        Mobile.type ="Smart";

        mb.show();
        mb2.show();
    
    }
}
