package demo;

import java.util.Arrays;
import java.util.List;

public class ImprovedLambdaExample {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "banana");

        // Using lambda with explicit underscore
        fruits.forEach(_item -> System.out.println("Fruit: " + _item));

        // Using lambda with inferred parameter
        fruits.forEach(System.out::println);

        // Another example with a single-method interface
        MySingleMethodInterface myInterface = _param -> System.out.println("Parameter: " + _param);
        myInterface.myMethod("Hello, World!");
    }

    interface MySingleMethodInterface {
        void myMethod(String param);
    }
}
