
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("Enter Array's Size : " );
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] num = new int[size];

        System.out.println("Enter Numbers : ");

        for(int i = 0; i < size; i++){
            num[i] = sc.nextInt();
        }

        System.out.print("Enetr the number You want search the Index : ");
        int search = sc.nextInt();

        for(int i = 0; i < size; i++){
            if(search == num[i]){
                System.out.println("Num Found at Index: " + i);
            }
        }
    }
    
}
