package demo;

public class InstanceOfExample16 {
    public static void main(String[] args) {
        Object obj = "Hello, Java 16";

        if (obj instanceof String str) {
            // Here, str is a new variable that is bound to the casted object if it's an instance of String
            System.out.println("The object is a String: " + str);
        } else {
            System.out.println("The object is not a String");
        }
    }
}
