class Car{
    int gear = 4 ;
    void carGear(){
        System.out.println("Default gears for normal car is " + gear);

        // If you creating a class under a class then that 
        // class is known as Inner class

        // Inner class can be static also  Outter class can't be static 

    }
    //   static  class  BMW

    static  class  BMW{
            int gear= 8;
            void BMWGear(){
                System.out.println("Default Gear in BMW " + gear);
            }
    }
}
public class InnerClassDemo {
    public static void main(String[] args) {
        Car c = new Car();
         c.carGear();

        //  U can call the method of inner class with 
        // outer class object
        //  c.BMWGear;


        // This is NOT vaild
        // BMW obj = new BMW();
        

        // To call the inner class method
        // Car.BMW obj = c.new BMW();
        // obj.BMWGear();

        // If the Inner class is static 
        Car.BMW obj = new Car.BMW();
        obj.BMWGear();
    }    
}
