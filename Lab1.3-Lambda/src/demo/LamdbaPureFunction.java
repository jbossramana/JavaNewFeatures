package demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LamdbaPureFunction {

    // A pure function that constructs greetings
    public List<String> greetNames(List<String> names, String prefix) {
        return names.stream()
                    .map(name -> prefix + name)
                    .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        LamdbaPureFunction example = new LamdbaPureFunction();
        List<String> names = Arrays.asList("Ramana", "Surya", "John");
        String prefix = "Hello, ";

        // Calling the pure function
        List<String> greetings = example.greetNames(names, prefix);

        // Now we print the results outside the pure function
        greetings.forEach(System.out::println);
    }
}
