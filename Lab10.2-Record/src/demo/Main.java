package demo;


public class Main {
    public static void main(String[] args) {
        // Creating a new Person record
       Person person = new Person("Surya", 30);
       person = person.withName("Aditya");
        // Accessing fields
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());
        
        
        // Using the generated methods
        System.out.println("Person details: " + person.toString());
        System.out.println("Is person equal to another person? " + person.equals(new Person("John", 30)));
        System.out.println("Hash code: " + person.hashCode());
        
        // Invoking additional method
        person.greet();
    }
}
