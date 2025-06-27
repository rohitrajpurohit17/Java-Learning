
public class SumFun {
    public static double addNumbers(double num1,double num2){
        double result= num1 + num2;
        return result;
    }
    public static double multiNumbers(double num1,double num2){
        double result= num1 * num2;
        return result;
    }
    public static void factNumber(int num){
        int fact = 1;
        if(num < 0){
            System.out.println("invalid number");
            return;
        }
        for(int i = 1; i <= num ; i++){
           fact *= i;
        }
        System.out.println(fact);
        return;
    }
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 20;
        int num = -1;
        // double answer=addNumbers(num1,num2);

        // double answer=multiNumbers(num1,num2);
        factNumber(num);
      

    }
}
