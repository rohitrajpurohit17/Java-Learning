class Details{

    // here we set vaibale private so no one can access it out sid e
    // of the class
    private int age;
    private String name;

    // We use Getter and Stter to set and get data

    // Here we use Set-Method set the value for vaiable
    public void setAge(int a){
        age = a;
    }

    // Here we get the Data to print the value
    public int getAge(){
        return age;
    }

    // Same for name
    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

}
public class GetterStter {
    public static void main(String[] args) {
        Details d = new Details();

        // Providing the value to private varible out side of class
        d.setAge(50);
        d.setName("Rohit");
        // Here accesing Private varible out side of class
        System.out.println("Age: " + d.getAge() + " NAme:" + d.getName());
    }
}
