package demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalLambdaExample3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sun", null, "Moon", null, "Star");

        // Using lambda expressions with Optional inside the lambda body
        names.forEach(name -> {
            Optional<String> optionalName = Optional.ofNullable(name);
            optionalName.ifPresentOrElse(
                    n -> System.out.println("Length of " + n + ": " + n.length()),
                    () -> System.out.println("Default message: Name is null")
            );
        });
    }
}
