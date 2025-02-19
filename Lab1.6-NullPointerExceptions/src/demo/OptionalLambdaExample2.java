package demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalLambdaExample2 {

	 public static void main(String[] args) {
	        List<Optional<String>> optionalNames = Arrays.asList(
	                Optional.of("Sun"),
	                Optional.empty(),
	                Optional.of("Moon"),
	                Optional.empty(),
	                Optional.of("Star")
	        );

	        // Using lambda expressions with Optional inside the lambda body
	        optionalNames.forEach(nameOptional ->
	                nameOptional.ifPresentOrElse(
	                        name -> System.out.println("Hello, " + name),
	                        () -> System.out.println("Default message: Name not provided")
	                )
	        );
	    }
	 
}
