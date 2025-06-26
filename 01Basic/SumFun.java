
public class SumFun {
    public static double addNumbers(double num1,double num2){
        double result= num1 + num2;
        return result;
    }
    public static double multiNumbers(double num1,double num2){
        double result= num1 * num2;
        return result;
    }
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 20;

        // double answer=addNumbers(num1,num2);

        double answer=multiNumbers(num1,num2);
        System.out.println(answer);

    }
}
