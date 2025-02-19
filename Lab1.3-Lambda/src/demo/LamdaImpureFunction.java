package demo;

import java.util.Arrays;
import java.util.List;

public class LamdaImpureFunction {
    private String prefix = "Hello, ";

    public void greetNames() {
        List<String> names = Arrays.asList("Ram", "Surya", "John");

        // Using a lambda expression to print greetings
        names.forEach(name -> System.out.println(prefix + name));
    }

    public static void main(String[] args) {
    	LamdaImpureFunction example = new LamdaImpureFunction();
        example.greetNames();
    }
}
