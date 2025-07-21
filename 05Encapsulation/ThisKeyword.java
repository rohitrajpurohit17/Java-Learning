class Human{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // this keyworod is used to represent current object
        // Current object means the object calling the method
        this.age = age;
    }
    // What actual way [this] keyword look like
    // public void setAge(int age, Human obj) {
    //     obj.age = age;

    // Also we have to provide obj while calling the method
    // obj.setAge(50,obj)
    // }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}

public class ThisKeyword {
    public static void main(String[] args) {
        Human obj = new Human();

        obj.setAge(50);
        obj.setName("Rohit");
        
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
