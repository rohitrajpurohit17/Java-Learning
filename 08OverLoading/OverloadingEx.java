
class Load{
    // Same Name but different parameter
    public void show(){
        System.out.println("Here overloadig one");
    }
    public void show(int a){
        System.out.println("OverLoading two");
    }
}
public class OverloadingEx {
    public static void main(String[] args) {
        Load l = new Load();
        l.show();
        l.show(1);
    }
}
