class Human{
    private int age;
    private String name;
    
    // Default contructor 
    // This construtor is automatically created when object is created
    // and it will be in background 
    // If we want to perform someting with constructor we have to expicitly write it 

    public Human(){
        System.out.println("I'm Default Constructor");
    }

    // Parameterized Constructor
    public Human(int age,String name){
        this.age = age;
        this.name = name;
        System.out.println("I'm paramerized COnstrutor");

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
public class Construtors {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human(18,"Rohit");

        System.out.println(obj1.getName()+ " : " + obj1.getAge());
        
    }
}
