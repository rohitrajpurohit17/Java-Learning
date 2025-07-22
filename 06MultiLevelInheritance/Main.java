
public class Main {
    public static void main(String[] args) {
        SuperAdvCalc sac = new SuperAdvCalc();
        int a = sac.add(5, 5);
        int b = sac.sub(10, 5);
        int c= sac.multi(5,5);
        int d = sac.div(10,5);
        double e = sac.power(4, 2);

        System.out.println(a + " " + b + " " + c + " " + d + " " + e);
    }
}
