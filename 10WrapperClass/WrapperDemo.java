

public class WrapperDemo {
    public static void main(String[] args) {
        
        // Boxing
         int num = 7;
        //  Integer nums = new Integer(num);This is Depricated 
        // If you use it will throw Error
        //  System.out.println(nums);


        // AutoBoxing
        Integer nums = num;
        System.out.println("AutoBoxing: " + num);

        // UnBoxing
        int num1 = nums.intValue();
        System.out.println("UnBoxing: " + num1);

        // Auto-UnBoxing
        int num2 = nums;
        System.out.println("Auto-UnBoxing: " + num2);

        // Wrapper Class Use
        String str = "12";
        int nums3 = Integer.parseInt(str);
        System.out.println("Converting String to Int : " + nums3 * 2);
    }
}
