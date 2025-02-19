package demo;

public class InstanceOfExample8 {
	public static void main(String[] args) {
        Object obj = "Hello, Java 8";

        if (obj instanceof String) {
            // Perform a separate cast to String and assign it to a variable
            String str = (String) obj;
            System.out.println("The object is a String: " + str);
        } else {
            System.out.println("The object is not a String");
        }
    }
}
