public class Strings {
    public static void main(String[] args) {
        String name = "Rohit";

        // Another way of concatination rather than using + operator
        // System.out.println(name.concat(" Rajpurohit"));

        System.out.println(name.charAt(0));
        System.out.println(name.substring(2,5));
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.matches("rohit"));
        System.out.println(name.equalsIgnoreCase("rohit"));
        
    }
}
